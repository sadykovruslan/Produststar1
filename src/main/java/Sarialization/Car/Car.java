package Sarialization.Car;

import java.io.Serializable;

public class Car implements Serializable {
    private final static long serialVersionUID = 1L;
    private String name;
    private int year;
    private Engine engine;
    private int price;

    public int getPrice() {
        return price;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    private String owner;

    public Car(String name, int year, Engine engine) {
        this.name = name;
        this.year = year;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
