package Functions;

import java.util.Scanner;

public class any_base_addition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getSum(b, n1, n2);
        System.out.println(d);
        scn.close();
    }

    public static int getSum(int b, int n1, int n2) {
        // write ur code here
        int d1 = 0, d2 = 0, carry = 0, dig = 0, sum = 0;
        int ans = 0, mul = 1;
        while (n1 > 0 || n2 > 0 || carry > 0) {
            d1 = n1 % 10;
            n1 = n1 / 10;

            d2 = n2 % 10;
            n2 = n2 / 10;

            sum = d1 + d2 + carry;
            dig = sum % b;
            carry = sum / b;

            ans = ans + dig * mul;

            mul = mul * 10;
        }
        return ans;
    }
}
