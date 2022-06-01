package Basics;

import java.util.Scanner;

public class rotate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        // count
        int copyofn = n, count = 0;
        while (copyofn > 0) {
            copyofn = copyofn / 10;
            count++;
        }

        r = r % count;

        // handling -ve rotaion
        if (r < 0) {
            r = r + count;
        }

        int divisor = (int) Math.pow(10, r);
        int multiplier = (int) Math.pow(10, count - r);
        int quotient = n / divisor;
        int remainder = n % divisor;

        int answer = remainder * multiplier + quotient;
        System.out.println(answer);

        scn.close();
    }
}
