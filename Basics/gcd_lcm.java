package Basics;

import java.util.Scanner;

public class gcd_lcm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int copyofn1 = n1, copyofn2 = n2;
        while (n1 > 0) {
            int rem = n2 % n1;
            n2 = n1;
            n1 = rem;
        }

        int gcd = n2;
        System.out.println("GCD: " + gcd);
        int lcm = copyofn1 * copyofn2 / gcd;
        System.out.println("LCM: " + lcm);
        scn.close();
    }
}
