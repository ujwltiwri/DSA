// package Arrays;

import java.util.Scanner;

public class subsets {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }
        int subset_value = (int) Math.pow(2, a.length);
        for (int i = 0; i < subset_value; i++) {
            int temp = i;
            String str = "";

            for (int j = a.length - 1; j >= 0; j--) {
                int rem = temp % 2;
                temp = temp / 2;

                if (rem == 0) {
                    str = "_" + "\t" + str;
                } else {
                    str = a[j] + "\t" + str;
                }
            }
            System.out.println(str);
        }

        scn.close();
    }
}
