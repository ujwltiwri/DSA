import java.io.*;
import java.util.*;

public class print_subsequence {
    // Bottom to Top Approach is Used to Save Memory
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printSS(str, "");
    }

    public static void printSS(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        printSS(ros, ans + ch); // for yes
        printSS(ros, ans); // for no
    }

}