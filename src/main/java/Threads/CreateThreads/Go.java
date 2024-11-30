package Threads.CreateThreads;

public class Go {
    public static void main(String[] args) {
        FromClass t1 = new FromClass();
        Thread t2 = new Thread(new FromInt());

        System.out.println("begin");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
