package Algoritm;
import java.util.Arrays;

public class SortArray {
    static int [] a = new int[]{1, 3, 5, 4};
    static int[] b = new int[]{2, 6, 9, 7};

    public static int[] sortArray (int[] arr) {
        int len = arr.length;
        if (len<2) {
            return arr;
                    }
        int middle = len/2;
        int[] firstPart =Arrays.copyOfRange(arr, 0, middle);
        int[] secondPart =Arrays.copyOfRange(arr, middle, len);
        return merge(sortArray(firstPart), sortArray(secondPart));

    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int lenA = arr1.length;
        int lenB = arr2.length;
        int a = 0;
        int b = 0;
        int len = lenA + lenB;
        int[] result = new int[len];

        for (int i=0; i<len; i++){
            if(b<lenB && a<lenA) {
                if (arr1[a] > arr2[b]) {
                    result[i] = arr2[b++];
                } else {
                    result[i] = arr1[a++];
                }
            }
            else if (b<lenB) {
                result[i] = arr2[b++];
                }
            else {
                result[i] = arr1[a++];
            }

        }
        return result;

    }

    public static int[] bubbleSort (int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int ch = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = ch;
                }
            }
        }
        return arr;
    }
    public static void printResult() {
        System.out.println(Arrays.toString(merge(a,b)));
    }
    public static void printSortArray(){
        System.out.println(Arrays.toString(sortArray(new int[] {38, 27, 43, 3, 9, 82, 10})));
    }

    public static void printBubbleSort(){
        System.out.println(Arrays.toString(bubbleSort(new int[] {8,2,5,1,6,9,3,7,4})));
    }
}