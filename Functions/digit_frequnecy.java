package Functions;

import java.util.*;

public class digit_frequnecy {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
        scn.close();
    }

    public static int getDigitFrequency(int n, int d) {
        // write code here
        int frequency = 0;
        while (n != 0) {
            int temp = n % 10;
            n = n / 10;

            if (d == temp) {
                frequency++;
            }

        }
        return frequency;
    }
}
