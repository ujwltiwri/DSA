import java.util.Scanner;

public class search_in_sorted {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int data = scn.nextInt();

        int r = 0, c = arr.length - 1;

        while (r < arr.length && c >= 0) {

            if (arr[r][c] < data) {
                r++;
            } else if (arr[r][c] > data) {
                c--;
            } else {
                System.out.println(r);
                System.out.println(c);
                return;
            }
        }

        System.out.println("Not Found");
        scn.close();
    }
}

// Time Complexity of this question is o(m+n) -> m = row & n = col

/*
 * 1. You are given a number n, representing the number of rows and columns of a
 * square matrix.
 * 2. You are given n * n numbers, representing elements of 2d array a.
 * Note - Each row and column is sorted in increasing order.
 * 3. You are given a number x.
 * 4. You are required to find x in the matrix and print it's location int (row,
 * col) format as discussed in output format below.
 * 5. In case element is not found, print "Not Found".
 */
