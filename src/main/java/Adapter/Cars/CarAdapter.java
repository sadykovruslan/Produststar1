package Adapter.Cars;

public class CarAdapter implements BasicCar{
    BasicCarRus basicCarRus;

    public CarAdapter(BasicCarRus basicCarRus) {
        this.basicCarRus = basicCarRus;
    }

    public void drive() {
        basicCarRus.drive();
    }
    public void xenonOn() {
        basicCarRus.lightOn();
    }

    public void xenonOff(){
        basicCarRus.lightOff();
    }
}
