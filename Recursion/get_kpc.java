import java.io.*;
import java.util.*;

public class get_kpc {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        ArrayList<String> ans = getKPC(str);
        System.out.println(ans);
    }

    static String[] arr = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static ArrayList<String> getKPC(String str) {
        if (str.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        char ch = str.charAt(0);
        ArrayList<String> recans = getKPC(str.substring(1));

        ArrayList<String> myans = new ArrayList<>();
        int val = ch - '0';
        String strfromval = arr[val];

        for (int i = 0; i < strfromval.length(); i++) {
            char c = strfromval.charAt(i); // each char extracted from strfromval like 7 has tu, so 1st t, then u will
                                           // be extracted
            // then here loop over recans and concatenate t & u with ans got from recans
            for (String s : recans) {
                myans.add(c + s);
            }

        }

        return myans;
    }

}

/*
 * 1. You are given a string str. The string str will contains numbers only,
 * where each number stands for a key pressed on a mobile phone.
 * 2. The following list is the key to characters map :
 * 0 -> .;
 * 1 -> abc
 * 2 -> def
 * 3 -> ghi
 * 4 -> jkl
 * 5 -> mno
 * 6 -> pqrs
 * 7 -> tu
 * 8 -> vwx
 * 9 -> yz
 * 
 * Input -> 78
 * Output -> [tv, tw, tx, uv, uw, ux]
 */