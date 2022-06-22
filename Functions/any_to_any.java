package Functions;

import java.util.Scanner;

public class any_to_any {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();
        int dn = getValue(n, b1, b2);
        System.out.println(dn);
        scn.close();
    }

    public static int getValue(int n, int b1, int b2) {
        int dec = anyToDecimal(n, b1);
        int dn = decimalToAnyBase(dec, b2);
        return dn;
    }

    public static int decimalToAnyBase(int n, int b) {
        int answer = 0, multiplier = 1;
        while (n > 0) {
            int remainder = n % b;
            n = n / b;
            answer = answer + (remainder * multiplier);
            multiplier = multiplier * 10;
        }
        return answer;
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
