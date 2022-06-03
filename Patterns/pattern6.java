package Patterns;

import java.util.*;

public class pattern6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst = n / 2 + 1, nsp = 1;

        for (int row = 1; row <= n; row++) {
            // First Half of stars Before Centre Space
            for (int stars = 1; stars <= nst; stars++) {
                System.out.print("*\t");
            }

            // space
            for (int space = 1; space <= nsp; space++) {
                System.out.print("\t");
            }

            // Second Half of stars After Centre Space
            for (int stars = 1; stars <= nst; stars++) {
                System.out.print("*\t");
            }

            // move to next line
            System.out.println();

            // main logic
            if (row <= n / 2) {
                // first half of pattern
                nst--;
                nsp = nsp + 2; // space is increase by 2 to get 2 spaces in center
            } else {
                nst++;
                nsp = nsp - 2;
            }
        }
        scn.close();
    }
    // * * * * *
    // * * * *
    // * *
    // * * * *
    // * * * * * *
}
