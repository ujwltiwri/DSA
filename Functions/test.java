package Functions;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();
        int dn = returnVal(n, b1, b2);
        System.out.println(dn);
        scn.close();
    }

    public static int returnVal(int n, int b1, int b2) {
        int dec = anyBaseToDecimal(n, b1);
        int dectoany = decimalToAnyBase(dec, b2);
        return dectoany;
    }

    public static int decimalToAnyBase(int n, int b) {
        int ans = 0, multiply = 1;

        while (n > 0) {
            int rem = n % b;
            ans = ans + multiply * rem;
            multiply = multiply * 10;
            n = n / b;
        }
        return ans;
    }

    public static int anyBaseToDecimal(int n, int b) {
        int ans = 0, multiply = 1;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            ans = ans + multiply * rem;
            multiply = multiply * b;
        }
        return ans;
    }
}
