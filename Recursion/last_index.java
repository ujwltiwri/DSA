// import java.io.*;
// import java.util.*;

// public class last_index {

// public static void main(String[] args) throws Exception {
// Scanner scn = new Scanner(System.in);
// int n = scn.nextInt();
// int[] arr = new int[n];
// for (int i = 0; i < arr.length; i++) {
// arr[i] = scn.nextInt();
// }
// int x = scn.nextInt();
// int ans = lastIndex(arr, 0, x);
// System.out.println(ans);
// scn.close();
// }

// public static int lastIndex(int[] arr, int idx, int x) {

// if (idx == arr.length)
// return -1;

// int recans = lastIndex(arr, idx + 1, x);

// if (recans != -1) {
// return recans;
// } else {
// if (arr[idx] == x) {
// return idx;
// } else {
// return -1;
// }
// }
// }

// }

// same question can be done in preorder as well

import java.io.*;
import java.util.*;

public class last_index {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int x = scn.nextInt();

        int answer = lastIndex(arr, n - 1, x);
        System.out.println(answer);
    }

    public static int lastIndex(int[] arr, int idx, int x) {
        if (idx == -1) {
            return -1;
        }

        // we are doing this in preorder->
        // How? because we are starting our search from last index to first index

        if (arr[idx] == x) {
            return idx;
        }

        int ans = lastIndex(arr, idx - 1, x);

        return ans;

    }

}