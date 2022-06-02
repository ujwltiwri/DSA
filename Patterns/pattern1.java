package Patterns;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int row = 1; row <= n; row++) {
            int nst = row; // nst means no of stars
            /* Here no of stars is equals to no of row */
            for (int stars = 1; stars <= nst; stars++) {
                System.out.print("*\t");
            }
            // move to next line
            System.out.println();
            nst++;
        }

        scn.close();
        /*
         * Output:
         *
         * *
         * * *
         * * * *
         * * * * *
         */
    }
}
