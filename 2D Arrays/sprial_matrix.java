import java.util.Scanner;

public class sprial_matrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int min_row = 0, max_row = arr.length - 1;
        int min_col = 0, max_col = arr[0].length - 1;
        int total_ele = n * m;

        while (total_ele > 0) {

            // left wall
            if (total_ele > 0) { // we are checking it again becuase last wall sometimes prints extra elements
                for (int row = min_row; row <= max_row; row++) {
                    System.out.println(arr[row][min_col]);
                    total_ele--;
                }
            }

            min_col++;

            // bottom wall
            if (total_ele > 0) {
                for (int col = min_col; col <= max_col; col++) {
                    System.out.println(arr[max_row][col]);
                    total_ele--;
                }
            }

            max_row--;

            // right wall
            if (total_ele > 0) {
                for (int row = max_row; row >= min_row; row--) {
                    System.out.println(arr[row][max_col]);
                    total_ele--;
                }
            }

            max_col--;

            // top wall
            if (total_ele > 0) {
                for (int col = max_col; col >= min_col; col--) {
                    System.out.println(arr[min_row][col]);
                    total_ele--;
                }
            }

            min_row++;
        }
        scn.close();
    }
}
