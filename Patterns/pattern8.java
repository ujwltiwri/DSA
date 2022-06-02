package Patterns;

import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst = 1, nsp = n - 1;
        for (int row = 1; row <= n; row++) {
            // space
            for (int space = 1; space <= nsp; space++) {
                System.out.print("\t");
            }

            // stars
            for (int stars = 1; stars <= nst; stars++) {
                System.out.print("*\t");
            }

            // move to next line
            System.out.println();
            nsp--;
        }
        scn.close();
    }
}
