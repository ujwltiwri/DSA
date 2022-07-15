import java.io.*;
import java.util.*;

public class print_all_permutations_of_a_string_iteratively {

    public static void solution(String str) {
        int n = str.length();
        int fact = factorial(n);

        for (int i = 0; i < fact; i++) {
            StringBuilder sb = new StringBuilder(str);
            int temp = i; // to not make any unwanted changes in outer loop

            for (int div = n; div >= 1; div--) {
                int rem = temp % div;
                System.out.print(sb.charAt(rem));
                sb.deleteCharAt(rem);

                temp = temp / div;
            }
            System.out.println();
        }

    }

    public static int factorial(int n) {
        int multiply = 1;
        for (int i = n; i >= 1; i--) {
            multiply = multiply * i;
        }
        return multiply;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
        scn.close();
    }

}

/*
 * 1. You are given a string. 2. You have to print all permutations of the given
 * string iteratively.
 * Input-> abc
 * Output ->
 * abc
 * bac
 * cab
 * acb
 * bca
 * cba
 */