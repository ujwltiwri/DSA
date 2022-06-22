package Functions;

import java.util.Scanner;

public class any_to_decimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int an = anyToDecimal(n, b);
        System.out.println(an);
        scn.close();
    }

    public static int anyToDecimal(int n, int b) {
        int ans = 0, mul = 1;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            ans = ans + (rem * mul);
            mul = mul * b;
        }
        return ans;
    }
}
