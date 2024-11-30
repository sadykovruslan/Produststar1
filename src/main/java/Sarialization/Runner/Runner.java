package Sarialization.Runner;

import java.io.Serializable;

public class Runner implements Serializable {
    private String name;
    private int age;
    private Shoes shoes;

    public Runner(String name, int age, Shoes shoes) {
        this.name = name;
        this.age = age;
        this.shoes = shoes;
    }

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

    public Shoes getShoes() {
        return shoes;
    }

    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }
}
