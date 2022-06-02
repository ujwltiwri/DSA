package Basics;

import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt(); // no of times we will check prime numbers

        for (int i = 1; i <= t; i++) {
            int factor = 0;
            int n = scn.nextInt();
            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0) {
                    factor++; // no is non prime because we have one more divisor other than 1 & no itself
                    break;
                }
            }

            if (factor == 0) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }
        scn.close();
    }
}