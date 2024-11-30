package Sarialization.Runner;

import java.io.*;

public class RunnerFromFile {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream(new File("D:\\Java\\Java 2\\Productstar\\runner.txt"));
        ObjectInputStream ois = new ObjectInputStream(file);
        Runner runner = (Runner) ois.readObject();

        System.out.println("Runner: " + runner.getName() + "\n" +
                            "Age: " + runner.getAge() + "\n" +
                "Shoes: " + runner.getShoes().getBrand());

        file.close();
        ois.close();
    }

}
