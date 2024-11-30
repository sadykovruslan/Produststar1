package DataTypes;

import java.util.PriorityQueue;

public class Kucha {
    static PriorityQueue<Integer> digits = new PriorityQueue<>();

    public static void sort(){
        digits.add(10);
        digits.add(8);
        digits.add(16);
        digits.add(7);
        digits.add(20);

        for (int i = 0; i<5; i++){
            System.out.println(digits.remove());
        }
    }

}
