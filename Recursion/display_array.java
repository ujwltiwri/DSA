import java.io.*;
import java.util.*;

public class display_array {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        displayArr(arr, 0);
        scn.close();
    }

    public static void displayArr(int[] arr, int idx) {
        if (idx == arr.length) {
            return;
        }

        System.out.println(arr[idx]);
        displayArr(arr, idx + 1);
    }

}
/*
 * You are required to print the elements of array from beginning to end each
 * in a separate line.
 */
