import java.io.*;
import java.util.*;

public class N_Queens {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] chess = new int[n][n];
        printNQueens(chess, "", 0);
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
        // qsf -> Queens So Far
        if (row == chess.length) {
            System.out.println(qsf + ".");
            return;
        }

        for (int col = 0; col < chess[0].length; col++) {
            if (isQueenSafe(chess, row, col)) {
                chess[row][col] = 1;
                printNQueens(chess, qsf + row + "-" + col + ", ", row + 1);
                chess[row][col] = 0;
            }
        }
    }

    public static boolean isQueenSafe(int[][] chess, int row, int col) {
        // For Upper Direction
        for (int i = row, j = col; i >= 0; i--) {
            if (chess[i][j] == 1)
                return false;
        }

        // For Upper Left Diagnol
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == 1)
                return false;
        }

        // For Upper Right Diagnol
        for (int i = row, j = col; i >= 0 && j < chess[0].length; i--, j++) {
            if (chess[i][j] == 1)
                return false;
        }

        return true;
    }
}

/*
 * 1. You are given a number n, the size of a chess board.
 * 2. You are required to place n number of queens in the n * n cells of board
 * such that no queen can kill another.
 * Note - Queens kill at distance in all 8 directions
 * 
 * Input -> 4
 * Output -> 0-1, 1-3, 2-0, 3-2, .
 * 0-2, 1-0, 2-3, 3-1, .
 */
