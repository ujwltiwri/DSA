import java.util.Scanner;

public class first_and_last_index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int data = scn.nextInt();

        int low = 0, high = n - 1;
        int first = -1;

        // calculate first index
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < data) {
                low = mid + 1;
            } else if (arr[mid] > data) {
                high = mid - 1;
            } else {
                first = mid;
                high = mid - 1;
            }
        }

        // beaucse values of low & high have been changed so we'll reinitiliaze these
        low = 0;
        high = n - 1;
        int last = -1;
        // calculate last index
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < data) {
                low = mid + 1;
            } else if (arr[mid] > data) {
                high = mid - 1;
            } else {
                last = mid;
                low = mid + 1;
            }
        }

        System.out.println(first);
        System.out.println(last);

        scn.close();
    }
}

/*
 * Input
 * A number n
 * n1
 * n2
 * .. n number of elements
 * A number d
 * 
 * Output
 * A number representing first index
 * A number representing last index
 */
