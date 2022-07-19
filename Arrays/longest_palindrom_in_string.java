// public class longest_palindrom_in_string {

// }

// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}

// } Driver Code Ends

// User function Template for Java

class Solution {
    static String longestPalin(String S) {
        // code here
        // int n = S.length();
        String ans = "";
        int high = 0;
        for (int i = 0; i < S.length(); i++) {
            for (int j = i + 1; j <= S.length(); j++) {
                String sub = S.substring(i, j);

                if (isPalindrom(sub) == true) {
                    for (int a = 0; a < sub.length(); a++) {
                        if (a > high) {
                            ans = sub;
                            high = a;
                        }
                    }
                }
            }
        }

        if (ans.length() > 1) {
            return ans;
        } else {
            return String.valueOf(S.charAt(0));
        }
    }

    public static boolean isPalindrom(String sub) {
        int i = 0, j = sub.length() - 1;
        while (i < j) {
            char st = sub.charAt(i);
            char end = sub.charAt(j);

            if (st != end) {
                return false;
            }

            i++;
            j--;
        }
        return true;
    }
}
