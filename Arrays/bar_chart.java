// package Arrays;

import java.io.*;
import java.util.*;

public class bar_chart {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        // greatest element in array
        int highest = maxele(arr);
        for (int row = highest; row > 0; row--) {

            for (int col = 0; col < arr.length; col++) {
                if (arr[col] == row || arr[col] > row) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }

            // move to next line
            System.out.println();
        }
        scn.close();
    }

    public static int maxele(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

}
