package Patterns;

import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // this program is to print fibonacci numbers in form of pattern
        int first = 0, second = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                int third = first + second;
                System.out.print(first + "\t");
                first = second;
                second = third;
            }

            // move to next line
            System.out.println();
        }
        scn.close();
        
        //Output
        /*
         * 0
         * 1 1
         * 2 3 5
         * 8 13 21 34
         * 55 89 144 233 377
         */
    }
}
