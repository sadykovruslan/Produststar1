package Collections.Students;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StudentStorage {
    private Map<Long, Student> studentStorageMap = new HashMap<>();
    private StudentSurnameStorage studentSurnameStorage = new StudentSurnameStorage();
    private Long currentId = 0L;

    /**
     * Создание данных о студенте
     * @param student данные о студенте
     * @return сгенерированный уникальный идентификатор студента
     */

    public Long createStudent (Student student){
        Long nextId = getNextId();
        studentStorageMap.put(nextId, student);
        studentSurnameStorage.studentCreated(nextId, student.getSurName());
        return nextId;

    }

    /**
     * Обновление данных о студенте
     * @param id идентификатор студента
     * @param student данные студента
     * @return true если данные были обновлены
     * false если сдудент не был найден
     */
    public boolean updateStudent(Long id, Student student){
        if(!studentStorageMap.containsKey(id)) {
            return false;
        } else {
            String newSurname = student.getSurName();
            String oldSurname = studentStorageMap.get(id).getSurName();
            studentSurnameStorage.studentUpdate(id, oldSurname, newSurname);
            studentStorageMap.put(id, student);
            return true;
        }
    }


    /**
     * удаляет данные о студенте
     * @param id идентификатор студента
     * @return true если студент был удален
     * false если студент не был найден по идентификатору
     */
    public boolean deleteStudent(Long id){
        Student removed = studentStorageMap.remove(id);
        if(removed != null){
            String surname = removed.getSurName();
            studentSurnameStorage.studentDeleted(id, surname);

        }
        return removed !=null;
    }

    public void search (String surname) {
        Student student = new Student();
        if(surname.isEmpty()){
            System.out.println(studentStorageMap);
        }
        if(surname.contains(", ")) {
            String[] surnamesArray = surname.split(", ");
            Set<Long> students = studentSurnameStorage.getStudentsBetweenSurnames(surnamesArray[0],surnamesArray[1]);
            for (Long studentId : students) {
                Student student1 = studentStorageMap.get(studentId);
                System.out.println(student1);
            }
        } else {
            System.out.println(studentStorageMap.get(student));
            }
    }

    public Long getNextId(){
        currentId += 1;
        return currentId;
    }

    public void printAll(){
        System.out.println(studentStorageMap);
    }

    public void printMap(Map<String, Long> data){
        data.entrySet().stream().forEach(e -> {
            System.out.println(e.getKey() + " " + e.getValue());
        });
    }

    public Map<String, Long> getCountByCourse(){
//        Map<String, Long> res = new HashMap<>();
//        for(Student student: studentStorageMap.values()){
//            String key = student.getCourse();
//            Long count = res.getOrDefault(key, 0L);
//            count++;
//            res.put(key, count);
//        }
//        return res;
        Map<String, Long> res = studentStorageMap.values().stream()
                .collect(Collectors.toMap(
                        s->s.getCourse(),
                        s->1L,
                        (count1, count2) ->count1 + count2
                ));
        return res;
    }
    public Map<String, Long> getCountByCity(){
        Map<String, Long> res = studentStorageMap.values().stream()
                .collect(Collectors.toMap(
                        s->s.getCity(),
                        s->1L,
                        (count1, count2) ->count1 + count2
                ));
        return res;
    }

}