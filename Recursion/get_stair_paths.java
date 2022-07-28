import java.io.*;
import java.util.*;

public class get_stair_paths {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(getStairPaths(n));
    }

    public static ArrayList<String> getStairPaths(int n) {
        if (n == 0) {
            ArrayList<String> positive_base = new ArrayList<>();
            positive_base.add("");
            return positive_base;
        }

        if (n < 0) {
            ArrayList<String> negative_base = new ArrayList<>();
            return negative_base;
        }

        ArrayList<String> recans1 = getStairPaths(n - 1);
        ArrayList<String> recans2 = getStairPaths(n - 2);
        ArrayList<String> recans3 = getStairPaths(n - 3);

        ArrayList<String> myans = new ArrayList<>();

        for (String s : recans1) {
            myans.add(1 + s);
        }

        for (String s : recans2) {
            myans.add(2 + s);
        }

        for (String s : recans3) {
            myans.add(3 + s);
        }

        return myans;

    }

}