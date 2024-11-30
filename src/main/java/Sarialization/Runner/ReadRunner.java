package Sarialization.Runner;

import java.io.*;

public class ReadRunner {

    public static void main(String[] args) throws IOException {
        Shoes adidas = new Shoes("Adidas Terrex", 43);
        Runner mityaev = new Runner("Dmitriy Mityaev", 29,adidas);


        FileOutputStream file = new FileOutputStream(new File("D:\\Java\\Java 2\\Productstar\\runner.txt"));
        ObjectOutputStream oos = new ObjectOutputStream(file);
        oos.writeObject(mityaev);

        file.close();
        oos.close();



    }
}
