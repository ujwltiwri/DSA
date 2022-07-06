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
