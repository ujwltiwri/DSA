package Patterns;

import java.util.*;

public class pattern15 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nspace = n / 2, nstars = 1;
        int count = 1;

        for (int row = 1; row <= n; row++) {
            // space
            for (int col = 1; col <= nspace; col++) {
                System.out.print("\t");
            }

            // to handle count in column
            int colcount = count;
            // stars
            for (int col = 1; col <= nstars; col++) {
                System.out.print(colcount + "\t");

                if (col <= nstars / 2) {
                    // 1st half of columns of each row
                    colcount++;
                } else {
                    // 2nd half of columns of each row
                    colcount--;
                }
            }

            // move to next line
            System.out.println();

            // main logic to print stars and handle count for rows as well
            if (row <= n / 2) {
                // 1st half of pattern
                nspace--;
                nstars = nstars + 2;
                count++;
            } else {
                // 2nd half of pattern
                nspace++;
                nstars = nstars - 2;
                count--;
            }
        }

    }
}