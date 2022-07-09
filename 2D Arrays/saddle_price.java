import java.util.*;

public class saddle_price {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] mat = new int[n][n]; // declaration and initialization of 2D Arrays

        // Input of 2D Arrays
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = scn.nextInt();
            }
        }

        for (int row = 0; row < mat.length; row++) {
            int mincolidx = leastinrow(mat, row);
            int maxrowidx = maxincol(mat, mincolidx);

            if (maxrowidx == row) {
                System.out.println(mat[maxrowidx][mincolidx]);
                return;
            }
        }

        System.out.print("Invalid Input");
        scn.close();
    }

    public static int leastinrow(int[][] mat, int row) {
        int min = mat[row][0];
        int mincol = 0;
        for (int col = 1; col < mat[0].length; col++) {

            if (mat[row][col] < min) {
                min = mat[row][col];
                mincol = col;
            }

        }
        return mincol;
    }

    public static int maxincol(int[][] mat, int col) {
        int max = mat[0][col];
        int maxrow = 0;

        for (int row = 1; row < mat.length; row++) {

            if (mat[row][col] > max) {
                max = mat[row][col];
                maxrow = row;
            }

        }

        return maxrow;
    }

}

/*
 * 1. You are given a square matrix of size 'n'. You are given n*n elements of
 * the square matrix.
 * 2. You are required to find the saddle price of the given matrix and print
 * the saddle price.
 * 3. The saddle price is defined as the least price in the row but the maximum
 * price in the column of the matrix.
 */