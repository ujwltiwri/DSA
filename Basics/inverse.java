package Basics;

import java.util.Scanner;

public class inverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int org_place = 1, answer = 0;
        while (n > 0) {
            int org_digit = n % 10;
            /* swap original digit to inverse place & original place to inverse digit */
            int inv_place = org_digit;
            int inv_digit = org_place;
            /*
             * this is the main logic, to inverse the number (multiply inverse digit into *
             * 10^inverse place - 1)
             */
            answer = answer + inv_digit * (int) Math.pow(10, inv_place - 1);
            org_place++; // increse original place by 1
            n = n / 10; // reduce n to get all the numbers
        }

        System.out.println(answer);

        scn.close();
    }
}
