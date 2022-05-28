package Basics;

import java.util.Scanner;

/**
 * reverse_number
 */
public class reverse_number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int copyofN = n; // making copy of n to divide and reduce it further to get all the digits
        while (n != 0) {
            copyofN = n % 10;
            System.out.println(copyofN);
            n = n / 10; // reducing n by 1 digit in every iteration of the loop to get all the digits
        }
        scn.close();
    }
}
