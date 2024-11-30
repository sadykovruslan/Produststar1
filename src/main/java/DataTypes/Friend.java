package DataTypes;

public class Friend {
    private String name;
    private int age;
    private boolean isFriendFromSchool;
    private double hoursSpentTogetherLastWeek;
//  создаем конструктор
    public Friend(String name, int age, boolean isFriendFromSchool, float hoursSpentTogetherLastWeek) {
        this.name = name;
        this.age = age;
        this.isFriendFromSchool = isFriendFromSchool;
        this.hoursSpentTogetherLastWeek = hoursSpentTogetherLastWeek;
    }
    // создем метод toString
    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isFriendFromSchool=" + isFriendFromSchool +
                ", hoursSpentTogetherLastWeek=" + hoursSpentTogetherLastWeek +
                '}';
    }
// геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isFriendFromSchool() {
        return isFriendFromSchool;
    }

    public void setFriendFromSchool(boolean friendFromSchool) {
        isFriendFromSchool = friendFromSchool;
    }

    public double getHoursSpentTogetherLastWeek() {
        return hoursSpentTogetherLastWeek;
    }

    public void setHoursSpentTogetherLastWeek(double hoursSpentTogetherLastWeek) {
        this.hoursSpentTogetherLastWeek = hoursSpentTogetherLastWeek;
    }
}
