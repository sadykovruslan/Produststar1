package PhoneBook;

import java.util.Scanner;

public class PhoneBook {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        Person.initDB();

        for (;;) {

            System.out.println("Input 1/2/3");
            String searchType = in.nextLine();

            System.out.println("Input name/phone/mail");
            String searcgString = in.nextLine();

            Person.findPerson(searchType, searcgString);

            String exit = in.nextLine();
            if(exit.equals("exit")) break;
        }
    }
}
