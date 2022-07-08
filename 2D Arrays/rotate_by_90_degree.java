import java.util.Scanner;

public class rotate_by_90_degree {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = n;
        int[][] arr = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        /*
         * The transpose of a matrix is found by interchanging its rows into columns or
         * columns into rows.
         */

        for (int i = 0; i < arr[0].length; i++) {
            for (int j = arr.length - 1; j >= 0; j--) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
        scn.close();
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
 * Input ->
 * 4
 * 11
 * 12
 * 13
 * 14
 * 21
 * 22
 * 23
 * 24
 * 31
 * 32
 * 33
 * 34
 * 41
 * 42
 * 43
 * 44
 * 
 * Output ->
 * 41 31 21 11
 * 42 32 22 12
 * 43 33 23 13
 * 44 34 24 14
 */