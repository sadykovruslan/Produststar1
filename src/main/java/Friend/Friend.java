package Friend;

import java.util.Scanner;

public class Friend {
    public static void main(String[] args) {

        System.out.println("Введите имя друга");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        System.out.println("Введите возраст друга");
        int age = in.nextInt();

        System.out.println("Друга зовут " +name+ ". Ему " + age + " лет.");
    }
}