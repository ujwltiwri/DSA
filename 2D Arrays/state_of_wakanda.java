import java.util.Scanner;

/**
 * state_of_wakanda
 */
public class state_of_wakanda {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] mat = new int[n][m];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = scn.nextInt();
            }
        }

        for (int col = 0; col < mat[0].length; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < mat.length; row++) {
                    System.out.println(mat[row][col]);
                }
            } else {
                for (int row = mat.length - 1; row >= 0; row--) {
                    System.out.println(mat[row][col]);
                }
            }
        }
        scn.close();
    }
}