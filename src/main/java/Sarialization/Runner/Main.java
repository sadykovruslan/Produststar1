package Sarialization.Runner;

import java.io.Serializable;

public class Main implements Serializable {
    public static void main(String[] args) {
        Shoes hoka = new Shoes("Hoka Gaviota", 42);
        Runner killian = new Runner("Killian Jornet", 35, hoka);

        System.out.println("Athlete: " + killian.getName() + "\n" +
                            "Age: " + killian.getAge() + "\n" +
                            "Shoes: " + killian.getShoes().getBrand());
    }
}