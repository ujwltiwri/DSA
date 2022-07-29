import java.io.*;
import java.util.*;

public class print_kpc {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printKPC(str, "");
    }

    static String[] arr = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printKPC(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);

        String ros = str.substring(1);

        int val = ch - '0';

        /*
         * 0 is of char type val of is eg. if we want '6' - '0' into num 6
         * the ASCII val of '6' is 54 and '0' is 48, So 54-48 = 6
         * hence this is converted into num 6
         */

        String strfromval = arr[val];

        for (int i = 0; i < strfromval.length(); i++) {
            char c = strfromval.charAt(i);
            printKPC(ros, ans + c);
        }

    }

}