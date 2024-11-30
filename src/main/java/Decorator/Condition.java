package Decorator;

public class Condition extends Decorator{
    Car car;

    public Condition(Car car) {
        this.car = car;
    }

    public String getInfo(){
        return car.getInfo() + " + Air Condition";
    }

    public int getPrice() {
        return car.getPrice() + 7000;
    }
}
