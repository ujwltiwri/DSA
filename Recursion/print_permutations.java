import java.io.*;
import java.util.*;

public class print_permutations {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printPermutations(str, "");
    }

    public static void printPermutations(String str, String prev_ans) {
        if (str.length() == 0) {
            System.err.println(prev_ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String left = str.substring(0, i);
            String right = str.substring(i + 1);
            String ros = left + right;

            printPermutations(ros, prev_ans + ch);
        }
    }

}