package Threads;

import java.util.concurrent.Semaphore;

public class Parking {
    public static void main(String[] args) {
        final Semaphore smp = new Semaphore(4);
        int placeNumber = 8;
        Runnable park =
                new Runnable() {
                    int count = 0;
                    @Override
                    public void run() {
                        int stayInPark = 3 +(int)(Math.random()*4.0);
                        int num = count++;
                        try {
                            smp.acquire();
                            System.out.println(" Машина № " + num + " заехала на парковку");
                            Thread.sleep(stayInPark * 5); // машина стоит на паковке рандомное время
                            System.out.printf(" Машина № " + num + " выехала с парковки");
                            smp.release();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                };
        for (int i = 0; i < placeNumber; i++) {
            new Thread(park).start();
        }
    }
}