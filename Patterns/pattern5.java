package Patterns;

import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nsp = n / 2, nst = 1;

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

            // main logic
            if (row <= n / 2) {
                nsp = nsp - 1;
                nst = nst + 2;
            } else {
                nsp = nsp + 1;
                nst = nst - 2;
            }
        }
        scn.close();
    }
    // Output
    /*
                * 	
	*	*	*	
*	*	*	*	*	
	*	*	*	
		*	
     */
}
