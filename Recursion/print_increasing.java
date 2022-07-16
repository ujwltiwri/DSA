import java.io.*;
import java.util.*;

public class print_increasing {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printIncreasing(n);
        scn.close();
    }

    public static void printIncreasing(int n) {
        if (n == 0) {
            return;
        }

        printIncreasing(n - 1);
        System.out.println(n);
    }

}

/*
 * Input-> 5
 * Output ->
 * 5
 * 4
 * 3
 * 2
 * 1
 */
