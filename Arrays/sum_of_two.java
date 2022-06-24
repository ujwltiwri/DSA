package Arrays;

import java.util.Scanner;

public class sum_of_two {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] a1 = new int[n1];

        // input in array 1
        for (int i = 0; i < n1; i++) {
            a1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] a2 = new int[n2];

        // input in array 2
        for (int i = 0; i < n2; i++) {
            a2[i] = scn.nextInt();
        }

        int[] ans = new int[(n1 > n2 ? n1 : n2) + 1]; // ans array for storing sum
        int i = n1 - 1; // pointer for array 1
        int j = n2 - 1; // pointer for array 2
        int k = ans.length - 1; // pointer for ans array
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) {
                sum = sum + a1[i];
            }

            if (j >= 0) {
                sum = sum + a2[j];
            }
            carry = sum / 10;
            sum = sum % 10;
            ans[k] = sum;

            i--;
            j--;
            k--;
        }

        System.out.println("Sum of Arrays\n");
        for (int p = 0; p < ans.length; p++) {
            if (p == 0 && ans[p] == 0) {
                continue; // means do nothing in if clause and move to next iteration
            }
            System.out.println(ans[p]);
        }

        scn.close();
    }
}
