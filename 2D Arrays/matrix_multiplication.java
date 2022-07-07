import java.util.Scanner;

public class matrix_multiplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // For Matrix A
        int n1 = scn.nextInt();
        int m1 = scn.nextInt();
        int[][] a = new int[n1][m1];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = scn.nextInt();
            }
        }

        // For Matrix B
        int n2 = scn.nextInt();
        int m2 = scn.nextInt();
        int[][] b = new int[n2][m2];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                b[i][j] = scn.nextInt();
            }
        }

        int[][] ans = new int[n1][m2];

        // for invalid matrix multiplicaiton
        if (m1 != n2) {
            System.out.println("Invalid Input");
        }

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                for (int k = 0; k < m1; k++) {
                    // k < m1 -> because m1 i.e col of 1st array is variable
                    ans[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

        scn.close();
    }
}
