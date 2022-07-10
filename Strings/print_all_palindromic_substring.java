import java.io.*;
import java.util.*;

public class print_all_palindromic_substring {

    public static void solution(String str) {
        // write your code here
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String sub = str.substring(i, j);

                if (ispalindrom(sub) == true) {
                    System.out.println(sub);
                }
            }
        }

    }

    public static boolean ispalindrom(String sub) {
        int low = 0, high = sub.length() - 1;

        while (low < high) {
            char start = sub.charAt(low);
            char end = sub.charAt(high);

            if (start != end) {
                return false;
            }

            low++;
            high--;
        }

        return true;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }

}