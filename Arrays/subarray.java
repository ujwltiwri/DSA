// package Arrays;

import java.util.Scanner;

public class subarray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }

        for (int start = 0; start < n; start++) {
            for (int end = start; end < a.length; end++) { // i to last array

                for (int k = start; k <= end; k++) {
                    System.out.print(a[k] + "\t");
                }

                // move to next line
                System.out.println();
            }
        }

        scn.close();
    }
}
