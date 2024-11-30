package PhoneBook;

public class Person {
    private String name;
    private String mail;
    private String phone;
    private static Person [] persons = new Person[10];

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public String getPhone() {
        return phone;
    }

    public Person(String name, String phone, String mail) {
        this.name = name;
        this.phone= phone;
        this.mail= mail;
    }

    public static void initDB() {
        persons [0] = new Person ("Юля", "89210000000", "Julia@yandex.com");
        persons [1] = new Person ("Сергей", "777777", "borya@yandex.com");
        persons [2] = new Person ("Друган", "23566777", "univer@yandex.com");
        persons [3] = new Person ("EvilBoss", "456546546", "boss@yandex.com");
        persons [4] = new Person ("Anna", "+79216661666", "mylove@yandex.com");
    }

    public String toString() {
        return "\n\nName: " + this.getName() + "\nPhone number: " + this.getPhone() + "\nEmail: " +
                this.getMail();
    }

    public static void findPerson (String searchType, String searcString) {
        switch (searchType){
            case "1":
                System.out.println(findName(searcString,persons));
                break;

            case "2":
                System.out.println(findPhone(searcString,persons));
                break;

            case "3":
                System.out.println(findMail(searcString,persons));
                break;

            default:
                break;
        }
    }
    public static Person findName(String name, Person[] persons){
        for(Person person: persons){
            if(person==null) continue;
            if(person.getName().equals(name)){
                return person;
            }
        }
        System.out.println("not exists");
        return null;
    }

    public static Person findPhone(String phone, Person[] persons){
        for(Person person: persons){
            if(person==null) continue;
            if(person.getPhone().equals(phone)){
                return person;
            }
        }
        System.out.println("not exists");
        return null;
    }

    public static Person findMail(String mail, Person[] persons){
        for(Person person: persons){
            if(person==null) continue;
            if(person.getMail().equals(mail)){
                return person;
            }
        }
        System.out.println("not exists");
        return null;
    }
}
