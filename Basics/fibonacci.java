package Basics;

import java.util.Scanner;

/**
 * fibonacci
 */
public class fibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int first = 0, second = 1; // because intially 0 & 1 will be present at 1st, 2nd position

        for (int i = 1; i <= n; i++) {
            /*
             * print first vari cuz it will have 0 at start and then other values in
             * sequence after addition
             */
            System.out.println(first);
            int third = first + second;
            first = second; // swap second var's value in first var
            second = third; // swap third var's value in second var
        }
        scn.close();
    }
}