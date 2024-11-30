package Decorator;

public class Main {
    public static void main(String[] args) {
        Car car1 = new AudiA3();
        System.out.println(car1.getInfo());
        System.out.println(car1.getPrice());

        car1 = new GPS(car1);
        System.out.println(car1.getInfo());
        System.out.println(car1.getPrice());

        car1 = new Condition(car1);
        System.out.println(car1.getInfo());
        System.out.println(car1.getPrice());
    }
}
