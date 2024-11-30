package Algoritm;
public class Fibonachi {
    public static int fib1(int n) {
        if (n<=1) return n;
        else {
            return fib1(n - 1) + fib1(n - 2);
        }
    }
    public static int fib2(int n) {
        int f1 = 1;
        int f2 = 1;
        int i = 0;
        while (i < n - 2) {
            int sum = f1 + f2;
            f1 = f2;
            f2 = sum;
            i = i + 1;
        }
        return f2;
    }

}
