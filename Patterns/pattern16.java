package Patterns;

import java.util.*;

public class pattern16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nstars = 1, nspace = n * 2 - 3;
        for (int i = 1; i <= n; i++) {
            // stars
            int lcount = 1;
            for (int j = 1; j <= nstars; j++) {
                System.out.print(lcount + "\t");
                lcount++;
            }

            // space
            for (int j = 1; j <= nspace; j++) {
                System.out.print("\t");
            }

            lcount -= 1; // reinitialize count by reducing it by 1 for right side of numbers

            if (i == n) {
                lcount = lcount - 1;
            }

            for (int j = 1; j <= nstars; j++) {
                if (j < n) {
                    System.out.print(lcount + "\t");
                    lcount--;
                }
            }

            // new line
            System.out.println();

            nstars++;
            nspace -= 2;

        }
        scn.close();
    }
}