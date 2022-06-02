package Patterns;

import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nsp = n - 1, nst = 1;
        for (int row = 1; row <= n; row++) {

            // print spaces
            for (int space = 1; space <= nsp; space++) {
                System.out.print("\t");
            }

            // print space
            for (int stars = 1; stars <= nst; stars++) {
                System.out.print("*\t");
            }

            // move to next line
            System.out.println();
            nst++;
            nsp--;
        }
        // Output
        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         */
        scn.close();
    }
}
