package Basics;

import java.util.Scanner;

/**
 * digits_of_num
 */
public class digits_of_num {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // count digits to calculate power
        int count = 0;
        int copyofN = n;
        while (copyofN > 0) {
            copyofN = copyofN / 10;
            count++;
        }

        int power = (int) Math.pow(10, count - 1);
        /*
         * calculate power of 10 and count-1 cuz we are calcualating it with 10's power.
         * So if count will be equals to no of digits then power will be increased by 1
         * extra.
         */
        int remainder = n;
        while (power > 0) {
            remainder = n / power;
            System.out.println(remainder);
            n = n % power;
            power = power / 10;
        }

        scn.close();
    }
}