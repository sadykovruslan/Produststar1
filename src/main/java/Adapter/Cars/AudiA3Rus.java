package Adapter.Cars;

public class AudiA3Rus implements BasicCarRus {
    final int light = 50;
    public void drive(){
        System.out.println("Поехали");
    }
    public void lightOn(){
        System.out.println("Включи свет");
    }
    public void lightOff(){
        System.out.println("Выключи свет");
    }
}
