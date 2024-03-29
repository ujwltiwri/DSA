import java.io.*;
import java.util.*;

public class print_subsequence {
    // Bottom to Top Approach is Used to Save Memory
    // public static void main(String[] args) throws Exception {
    // Scanner scn = new Scanner(System.in);
    // String str = scn.nextLine();
    // printSS(str, "");
    // }

    // public static void printSS(String str, String ans) {
    // if (str.length() == 0) {
    // System.out.println(ans);
    // return;
    // }

    // char ch = str.charAt(0);
    // String ros = str.substring(1);

    // printSS(ros, ans + ch); // for yes
    // printSS(ros, ans); // for no
    // }

    // if also asked to return count then the code will be like this
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(printSS(str, ""));
    }

    public static int printSS(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return 1;
        }
        int count = 0;
        char ch = str.charAt(0);
        String ros = str.substring(1);

        count += printSS(ros, ans + ch); // for yes
        count += printSS(ros, ans); // for no

        return count;
    }

}