package DataTypes;

public class WorkShop {
    public static void main(String[] args) {
        Friend[] friend ={new Friend("Ruslan", 37, false, 36.5F),
                          new Friend("Polina", 26, true, 3.3F),
                          new Friend("Alisa", 27, false, 2.4F),
                          new Friend("Denis", 44, true, 13.7F)};
        for (int i = 0; i< friend.length; i++) {
            System.out.println("Name: " + friend[i].getName() + " is " + friend[i].getAge()
                                        + ". From school: " + friend[i].isFriendFromSchool()
                                        + ". Last week we spend together " + friend[i].getHoursSpentTogetherLastWeek() + " hours.");
        }
    }
}