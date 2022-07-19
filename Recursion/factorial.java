import java.io.*;
import java.util.*;

public class factorial {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int answer = factorial(n);
        System.out.println(answer);
        scn.close();
    }

    public static int factorial(int n) {
        // int fact = 1;

        if (n == 0) {
            return 1;
        }

        // fact = n * factorial(n-1);
        // return fact;
        int recans = factorial(n - 1);
        int ans = n * factorial(recans);
        return ans;
    }

}