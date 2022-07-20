import java.io.*;
import java.util.*;

public class last_index {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int ans = lastIndex(arr, 0, x);
        System.out.println(ans);
        scn.close();
    }

    public static int lastIndex(int[] arr, int idx, int x) {

        if (idx == arr.length)
            return -1;

        int recans = lastIndex(arr, idx + 1, x);

        if (recans != -1) {
            return recans;
        } else {
            if (arr[idx] == x) {
                return idx;
            } else {
                return -1;
            }
        }
    }

}