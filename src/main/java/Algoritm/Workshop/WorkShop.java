package Algoritm.Workshop;

public class WorkShop {
    public static void main(String[] args) {

        sortVoids sv = new sortVoids();


        System.out.println("----------------------------------");
        sv.bubbleSort(sv.genArray());
        System.out.println("----------------------------------");
        sv.insertSort(sv.genArray());
        System.out.println("----------------------------------");
        sv.selectSort(sv.genArray());
        System.out.println("----------------------------------");
        sv.standardSortVoidFromJava(sv.genArray());


    }
}