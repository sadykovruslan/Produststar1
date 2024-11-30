package Sarialization.Car;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Engine engine = new Engine();
        engine.setHp(150);

        Car fordFocus = new Car("Ford Focus", 2020, engine);
        System.out.println(fordFocus.getName());

        FileOutputStream fos = new FileOutputStream(new File("D:\\Java\\Productstar\\Files\\Serialization\\car.ser"));

        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(fordFocus);
        oos.close();

    }
}
