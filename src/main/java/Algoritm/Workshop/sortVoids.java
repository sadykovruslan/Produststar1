package Algoritm.Workshop;

import java.util.Arrays;
import java.util.Random;

public class sortVoids {

    public void bubbleSort (int[] arr){
        long start = System.currentTimeMillis();
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 1; j <arr.length - i; j++){
                if(arr[j - 1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        long finish = System.currentTimeMillis();
        System.out.println("Lead time of bubbleSort is: " + (finish-start) + " ms");
    }

    public void insertSort(int[] arr) {
        long start = System.currentTimeMillis();
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        long finish = System.currentTimeMillis();
        System.out.println("Lead time of insertSort is: " + (finish-start) + " ms");
    }

    public void selectSort(int[] arr){
        long start = System.currentTimeMillis();
        for(int i =0; i <arr.length; i++){
            int minElrmentIndex = i;
            for(int j = i + 1; j <arr.length; j++) {
                if (arr[minElrmentIndex] > arr[j]) {
                    minElrmentIndex = j;
                }
            }
            if (minElrmentIndex !=i){
                int temp = arr[i];
                arr[i] = arr[minElrmentIndex];
                arr[minElrmentIndex] = temp;
            }
       }
        long finish = System.currentTimeMillis();
        System.out.println("Lead time of selectSort is: " + (finish-start) + " ms");
    }

    public void standardSortVoidFromJava(int[] arr){
        long start = System.currentTimeMillis();
        Arrays.sort(arr);
        long finish = System.currentTimeMillis();
        System.out.println("Lead time of standard Java void is " + (finish-start) + " ms");
    }

    public int[] genArray(){
        int arrLength = 100_000;
        int[] arr = new int[arrLength];
        for(int i = 0; i < arrLength; i++){
            arr[i] = new Random().nextInt(1_000_000_000);
        }
        return arr;
    }
}
