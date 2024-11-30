package Algoritm;
public class Factorial {
    public static int factorial(int a){
        if(a==1) return 1;
        return factorial(a-1)*a;
    }
}
