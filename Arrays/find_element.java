package Arrays;

import java.util.Scanner;

public class find_element {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // array input
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int d = scn.nextInt();

        int index = -1;
        for (int i = 0; i < arr.length; i++) {

            if (d == arr[i]) {
                index = i;
            }

        }
        System.out.println(index);
        scn.close();
    }
}
