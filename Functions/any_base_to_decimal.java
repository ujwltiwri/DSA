package Functions;

import java.util.Scanner;

public class any_base_to_decimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
        scn.close();
    }

    public static int getValueIndecimal(int n, int b) {
        int power = 1, count = 0, answer = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            power = (int) Math.pow(b, count);
            answer = answer + rem * power;
            count++;
        }
        return answer;
    }
}
