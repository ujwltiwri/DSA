import java.util.Scanner;

/**
 * demo
 */
public class demo {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] mat = new int[n][m]; // declaration and initialization of 2D Arrays

        // Input of 2D Arrays
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = scn.nextInt();
            }
        }

        // Output of 2D Arrays
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        scn.close();
    }
}