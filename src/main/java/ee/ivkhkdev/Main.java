package ee.ivkhkdev;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[20];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 50) * 2;
        }


        int min = Arrays.stream(arr).min().orElseThrow();
        int max = Arrays.stream(arr).max().orElseThrow();


        int sum = 0;
        int count = 0;
        for (int val : arr) {
            if (val != min && val != max) {
                sum += val;
                count++;
            }
        }


        double averageExceptMinMax = count > 0 ? (double) sum / count : 0;

        
        System.out.println("Numbers: " + Arrays.toString(arr));
        System.out.println("Average without min and max: " + averageExceptMinMax);
    }
}
