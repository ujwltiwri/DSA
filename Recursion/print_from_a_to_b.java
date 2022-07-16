import java.util.Scanner;

public class print_from_a_to_b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printIncreasin(1, n);
        scn.close();
    }

    public static void printIncreasin(int a, int b) {

        if (a == b + 1) {
            return;
        }

        System.out.println(a);
        printIncreasin(a + 1, b);
    }
}