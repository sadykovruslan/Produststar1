package Threads;

public class WaitAndNotify {
    private final Object mon = new Object();
    private boolean aTurn;

    public static void main(String[] args) {
        WaitAndNotify w = new WaitAndNotify();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i =0; i<3; i++){
                    w.firstA();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i =0; i<3; i++){
                    w.thenB();
                }
            }
        });

        t1.start();
        t2.start();
    }

    private void firstA() {
        synchronized (mon) {
            try {
                System.out.println("a-turn");
                if(!aTurn){
                    System.out.println("a-wait");
                    mon.wait();
                }
                System.out.println("A");
                aTurn = false;
                System.out.println("a-notify");
                mon.notify();
            } catch (InterruptedException e){
                e.printStackTrace();

            }
        }
    }

    private void thenB() {
        synchronized (mon) {
            try {
                System.out.println("b-turn");
                if(aTurn){
                    System.out.println("b-wait");
                    mon.wait();
                }
                System.out.println("B");
                aTurn = true;
                System.out.println("B-notify");
                mon.notify();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
