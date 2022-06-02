package Patterns;

import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // 1st Method of this question
        // int n = scn.nextInt();
        // int space = n / 2, stars = 1;

        // for (int i = 1; i <= n; i++) {
        // // space
        // for (int j = 1; j <= space; j++) {
        // System.out.print("\t");
        // }

        // // stars
        // for (int j = 1; j <= stars; j++) {
        // if (j == 1 || j == stars) {
        // System.out.print("*\t");
        // } else {
        // System.out.print("\t");
        // }
        // }

        // // next line
        // System.out.println();
        // // main logic
        // if (i <= n / 2) {
        // stars = stars + 2;
        // space--;
        // } else {
        // stars = stars - 2;
        // space++;
        // }

        // }

        // 2nd Method of this question
        int n = scn.nextInt();
        int otspace = n / 2, inspace = -1;
        // I know that inner space is 0 initially but we need to look at sequence also
        // and -1 or 0 both would mean zero so -1 is taken to maintain the sequence

        for (int row = 1; row <= n; row++) {
            // outer space
            for (int space = 1; space <= otspace; space++) {
                System.out.print("\t");
            }

            System.out.print("*\t");

            // inner space
            for (int space = 1; space <= inspace; space++) {
                System.out.print("\t");
            }

            // becuase first and last stars have to printed only once
            if (row > 1 && row < n) {
                System.out.print("*\t");
            }

            // next line
            System.out.println();

            // main logic
            if (row <= n / 2) {
                otspace = otspace - 1;
                inspace = inspace + 2;
            } else {
                otspace = otspace + 1;
                inspace = inspace - 2;
            }
        }

        scn.close();
    }
}
