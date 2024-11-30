package Adapter.Cars;

public class AudiA3 implements BasicCar {
    final int light = 100;
    public void drive(){
        System.out.println("Drive");
    }
    public void xenonOn(){
        System.out.println("Light on");
    }
    public void xenonOff(){
        System.out.println("Light off");
    }
}
