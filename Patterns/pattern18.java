package Patterns;

import java.util.*;

public class pattern18 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int stars = n, space = 0;

        for (int row = 1; row <= n; row++) {
            // space
            for (int col = 1; col <= space; col++) {
                System.out.print("\t");
            }

            // stars
            for (int col = 1; col <= stars; col++) {
                if (row == 1 || row > n / 2 || col == 1 || col == stars) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }

            // move to next line
            System.out.println();

            // main logic to reduce stars and increase space and its opposite
            if (row <= n / 2) {
                stars = stars - 2;
                space++;
            } else {
                stars = stars + 2;
                space--;
            }
        }

        // 2nd Approach It's Bit Lengthy
        // Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        // int stars = n, space = 0;

        // for (int row = 1; row <= n; row++) {
        // // code will be done in 2 parts
        // // 1-> Empty Triangle
        // if (row < n / 2 + 1) {
        // // 1st Part-> Empty Triangle

        // // space will be printed first
        // for (int col = 1; col <= space; col++) {
        // System.out.print("\t");
        // }

        // // stars will be printed after space
        // for (int col = 1; col <= stars; col++) {
        // // we will print stars only when col = 1 || col == stars
        // if (col == 1 || col == stars || row == 1) {
        // System.out.print("*\t");
        // } else {
        // System.out.print("\t");
        // }
        // }

        // // logic to reduce stars
        // stars = stars - 2;
        // space = space + 1;
        // } else {
        // // 2nd Part-> Filled Triangle
        // // space will be printed first
        // for (int col = 1; col <= space; col++) {
        // System.out.print("\t");
        // }
        // // stars will be printed after space
        // for (int col = 1; col <= stars; col++) {
        // System.out.print("*\t");
        // }

        // // logic to increase stars and reduce spaces
        // stars = stars + 2;
        // space = space - 1;

        // }

        // // move to next line
        // System.out.println();
        // }
        scn.close();
    }
}