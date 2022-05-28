package Basics;

import java.util.Scanner;

/**
 * count_digits
 */
public class count_digits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count = 0;

        // using for loop
        // for (int i = 1; n != 0; i++) {
        // n = n / 10;
        // count++;
        // }

        // using while loop
        while (n != 0) {
            n = n / 10;
            count++;
        }

        System.out.println(count);
        scn.close();
    }
}