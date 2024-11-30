package Threads;

import java.util.concurrent.Semaphore;

public class SimpleSemaphore {
    public static void main(String[] args) {
        final Semaphore smp = new Semaphore(4);
        Runnable limitedCall =
                new Runnable() {
                    int count = 0;
                    @Override
                    public void run() {
                        int time = 3 +(int)(Math.random()*4.0);
                        int num = count++;
                        try {
                            smp.acquire(); //в этой секции поток захватывает семафор, если в нем есть свободные места.
                                            // если мест нет - ждет пока не появится место
                            System.out.println(" Поток № " + num + "начинает выполнять очень долгоое действие " +  time + " сек");
                            Thread.sleep(time * 10); // делаем вид что поток выполняет задачу
                            System.out.printf(" Поток № " + num + " завершил работу ");
                            smp.release();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                };
        for (int i = 0; i < 10; i++) {
            new Thread(limitedCall).start();
        }
    }
}
