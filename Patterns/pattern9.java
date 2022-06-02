package Patterns;

import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int row = 1; row <= n; row++) {

            // stars
            for (int col = 1; col <= n; col++) {
                if (row == col || row + col == n + 1) {
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
}
