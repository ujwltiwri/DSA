package Patterns;

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst = n;
        for (int row = 1; row <= n; row++) {
            for (int stars = 1; stars <= nst; stars++) {
                System.out.print("*\t");
            }
            // move to next line
            System.out.println();
            nst--;
        }
        // Output:
        /*
         * * * * *
         * * * *
         * * *
         * *
         *
         */
        scn.close();
    }
}
