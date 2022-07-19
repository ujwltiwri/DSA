// package Arrays;

import java.util.*;

public class diff_of_two_array {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] a1 = new int[n1];
        // 1st array input
        for (int i = 0; i < n1; i++) {
            a1[i] = scn.nextInt();
        }

        // 2nd array
        int n2 = scn.nextInt();
        int[] a2 = new int[n2];
        // 1st array input
        for (int i = 0; i < n2; i++) {
            a2[i] = scn.nextInt();
        }

        int borrow = 0;
        int i = n1 - 1; // pointer for array 1
        int j = n2 - 1; // pointer for array 2
        int[] ans = new int[n2];
        int k = ans.length - 1;

        while (k >= 0) {
            int diff = borrow;
            int a1val = 0; // for tackling with out of bound error for array 1

            if (i >= 0) {
                a1val = a1[i];
            } else {
                a1val = 0;
            }

            if (i >= 0) {
                diff = diff + a1[i];
            }

            if (j >= 0) {
                diff = diff + a2[j];
            }

            diff = a2[j] + borrow - a1val;

            if (diff < 0) {
                diff = diff + 10;
                borrow = -1;
            } else {
                borrow = 0;
            }

            ans[k] = diff;
            i--;
            j--;
            k--;
        }

        for (int a = 0; a < ans.length; a++) {
            if (a == 0 && ans[a] == 0) {
                // nothing to do here
            } else {
                System.out.println(ans[a]);
            }
        }
        scn.close();
    }

}