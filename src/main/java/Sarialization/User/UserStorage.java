package Sarialization.User;

import java.io.*;

public class UserStorage {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = new User("login", "777");

        FileOutputStream fos = new FileOutputStream(new File("D:\\Java\\Productstar\\Files\\Serialization\\user.ser"));

        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(user);
        oos.close();

        ///////

        FileInputStream fileInputStream = new FileInputStream("D:\\Java\\Productstar\\Files\\Serialization\\user.ser");

        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        User  user1 = (User) objectInputStream.readObject();

        System.out.println(user1.getLogin() + "\n" +
                user1.getPassword());

    }
}
