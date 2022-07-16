
import java.io.*;
import java.util.*;

public class power_linear {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int ans = power(x, n);
        System.out.println(ans);
        scn.close();
    }

    public static int power(int x, int n) {
        int ans = x;

        if (n == 0) {
            return 1;
        }

        ans = ans * power(x, n - 1);

        return ans;
    }

}

/*
 * 1. You are given a number x.
 * 2. You are given another number n.
 * 3. You are required to calculate x raised to the power n. Don't change the
 * signature of power function .
 */
