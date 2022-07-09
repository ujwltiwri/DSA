import java.util.Scanner;

public class exit_point_of_matrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        // Directions
        // dir = 0 -> East
        // dir = 1 -> South
        // dir = 2 -> West
        // dir = 3 -> North

        int row = 0, col = 0, dir = 0;
        while (true) {
            dir = (dir + arr[row][col]) % 4; // %4 to get the 4th direction actually 4th dir will be converted to zero

            if (dir == 0) {
                col++;
            } else if (dir == 1) {
                row++;
            } else if (dir == 2) {
                col--;
            } else if (dir == 3) {
                row--;
            }

            if (row < 0) {
                row++;
                break;
            } else if (col < 0) {
                col++;
                break;
            } else if (row == arr.length) {
                row--;
                break;
            } else if (col == arr[0].length) {
                col--;
                break;
            }
        }

        System.out.println(row);
        System.out.println(col);

        scn.close();
    }
}

/*
 * 4. Consider this array a maze and a player enters from top-left corner in
 * east direction.
 * 5. The player moves in the same direction as long as he meets '0'. On seeing
 * a 1, he takes a 90 deg right turn.
 * 6. You are required to print the indices in (row, col) format of the point
 * from where you exit the matrix.
 */
