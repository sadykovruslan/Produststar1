package Adapter.Cars;

public class Main {
    public static void main(String[] args) {
        BasicCar audiA3 = new AudiA3();
        centralProcessor cp = new centralProcessor(audiA3);
        cp.work();

        CarAdapter audiA3Rus = new CarAdapter(new AudiA3Rus());
        centralProcessor cpRus = new centralProcessor(audiA3Rus);
        cpRus.work();
    }

}