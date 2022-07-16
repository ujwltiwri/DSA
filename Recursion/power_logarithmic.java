import java.io.*;
import java.util.*;

public class power_logarithmic {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int ans = power(x, n);
        System.out.println(ans);
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        // in this question we are only going till n/2 iteration, and not for all
        // iterations
        int recAns = power(x, n / 2);
        int ans = recAns * recAns;

        if (n % 2 == 1) {
            ans = ans * x;
        }

        return ans;
    }

}

/*
 * 1. You are given a number x.
 * 2. You are given another number n.
 * 3. You are required to calculate x raised to the power n. Don't change the
 * signature of power function.
 * 
 * Note1 -> The previous version expects the call stack to be of n height. This
 * function expects call function to be only log(n) high.
 */