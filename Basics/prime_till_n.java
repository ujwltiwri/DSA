package Basics;

import java.util.Scanner;

/**
 * prime_till_n
 */
public class prime_till_n {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();

        for (int n = low; n <= high; n++) { // low to high range
            int factor = 0; // It is initially zero and if it even increase by 1 then the no is non prime
            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0) { // if number divides the divisor i.e. there is at least 1 more divisor other
                                    // than 1 & no itself
                    factor++;
                    break;
                }
            }

            if (factor == 0) { // It means the no is prime if factor is 0
                System.out.println(n);
            }

        }

        scn.close();
    }
}
