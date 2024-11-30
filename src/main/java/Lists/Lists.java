package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
public class Lists {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 5));
        int k = 2;
        getRollingAverage(arr, k);
    }

    private static List<Float> getRollingAverage(ArrayList<Integer> arr, int k) {
        int sum = 0;
        LinkedList<Integer> subArr = new LinkedList<>();
        List<Float> rollingAverage = new ArrayList<>();
        for (int i = 0; i<k; i++){
            subArr.add(arr.get(i));
            sum += arr.get(i);
        }
        float fSum = (float) sum;
        float average = fSum/k;

        rollingAverage.add(average);

        for (int i = k; i<arr.size(); i++){
            subArr.add(arr.get(i));
            subArr.remove();
            float average1 = subArr.get(0);
            float average2 = subArr.get(1);
            float value = (average1 + average2)/k;
            rollingAverage.add(value);
        }
        System.out.println(rollingAverage);
        return rollingAverage;
    }
}


