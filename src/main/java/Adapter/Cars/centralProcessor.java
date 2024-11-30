package Adapter.Cars;

public class centralProcessor {
    private BasicCar car;

    public centralProcessor(BasicCar car) {
        this.car = car;
    }

    public void work(){
        car.drive();
        car.xenonOn();
        car.xenonOff();

    }

}
