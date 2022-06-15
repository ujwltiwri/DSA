package Functions;

import java.util.Scanner;

public class decimal_to_any_base {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);

        scn.close();
    }

    public static int getValueInBase(int n, int b) {
        // write code here
        int multiplier = 1;
        int ans = 0;
        while (n != 0) {
            int rem = n % b;
            ans = ans + (rem * multiplier);
            multiplier = multiplier * 10; // we will get our multiplier or power of 10 to multiply with answer
            n = n / b;
        }
        return ans;
    }
}
