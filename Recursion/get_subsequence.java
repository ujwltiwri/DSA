import java.io.*;
import java.util.*;

public class get_subsequence {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        ArrayList<String> ans = gss(str);
        System.out.println(ans);

        scn.close();
    }

    public static ArrayList<String> gss(String str) {
        if (str.length() < 1) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> recans = gss(ros);
        ArrayList<String> myans = new ArrayList<>();

        // for(String s:recans){
        // myans.add(s);
        // }

        // for loop by indexing method
        for (int i = 0; i < recans.size(); i++) {
            String s = recans.get(i);
            myans.add(s);
        }

        for (String s : recans) {
            myans.add(ch + s);
        }

        return myans;
    }

}