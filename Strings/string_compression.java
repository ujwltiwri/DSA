import java.io.*;
import java.util.*;

public class string_compression {

    public static String compression1(String str) {
        // write your code here
        StringBuilder sb = new StringBuilder(str.charAt(0) + "");

        for (int i = 1; i < str.length(); i++) {
            char prev = str.charAt(i - 1);
            char current = str.charAt(i);

            if (prev == current) {
                // do nothing
            } else {
                sb.append(current);
            }
        }

        return sb.toString();
    }

    public static String compression2(String str) {
        StringBuilder sb = new StringBuilder(str.charAt(0) + "");
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            char prev = str.charAt(i - 1);
            char current = str.charAt(i);

            if (prev == current) {
                count++;
            } else {
                if (count > 1) {
                    sb.append(count);
                    count = 1;
                }

                sb.append(current);
            }
        }
        // checking for last iteration
        if (count > 1) {
            sb.append(count);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(compression1(str));
        System.out.println(compression2(str));

        scn.close();
    }

}

/*
 * 1. You are given a string.
 * 2. You have to compress the given string in the following two ways -
 * First compression -> The string should be compressed such that consecutive
 * duplicates of characters are replaced with a single character.
 * For "aaabbccdee", the compressed string will be "abcde".
 * Second compression -> The string should be compressed such that consecutive
 * duplicates of characters are replaced with the character and followed by the
 * number of consecutive duplicates.
 * For "aaabbccdee", the compressed string will be "a3b2c2de2".
 */