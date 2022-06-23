package Arrays;

import java.util.*;

/**
 * span_of_array
 */
public class span_of_array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        // input of array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int max = arr[0], min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

            if (min > arr[i]) {
                min = arr[i];
            }
        }

        // 2nd method
        // for (int i = 1; i < arr.length; i++) {

        // if (arr[i] < min) {
        // min = arr[i];
        // }

        // if (arr[i] > max) {
        // max = arr[i];
        // }
        // }

        // 3rd method
        max = Integer.MIN_VALUE; // minium integer value that can be represented in 32 bits
        min = Integer.MAX_VALUE; // maximum positive integer value that can be represented in 32 bits

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        int ans = max - min;
        System.out.println(ans);
        scn.close();
    }
}