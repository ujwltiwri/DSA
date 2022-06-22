package Functions;

import java.util.*;

/**
 * decimal_to_any
 */
public class decimal_to_any {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = decimalToAnyBase(n, b);
        System.out.println(dn);
        scn.close();
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
}