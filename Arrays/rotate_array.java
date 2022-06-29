package Arrays;

import java.io.*;
import java.util.*;

public class rotate_array {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static void rotate(int[] a, int k) {
        k = k % a.length;

        if (k < 0) {
            k = k + a.length;
        }
        int n = a.length;
        // 1st & Best Solution
        reverse(a, 0, n - 1); // 1st Time -> complete reverse
        reverse(a, 0, k - 1); // 2nd time -> 0 to r reverse
        reverse(a, k, n - 1); // 3rd time -> r to n-1 reverse

        // 2nd Solution
        reverse(a, 0, n - k - 1); // 1st -> 0 to n-k-1
        reverse(a, n - k, n - 1); // 2nd -> n-k to n-1
        reverse(a, 0, n - 1); // 3rd -> 0 to n-1 -> Complete Reverse

    }

    public static void reverse(int[] a, int i, int j) {
        // int i = 0, j = a.length - 1;
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        rotate(a, k);
        display(a);
    }

}
