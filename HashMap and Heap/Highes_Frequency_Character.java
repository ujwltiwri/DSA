import java.io.*;
import java.util.*;

public class Highes_Frequency_Character {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (map.containsKey(ch) == false) {
                map.put(ch, 1);
            } else {
                int org_freq = map.get(ch);
                int new_freq = org_freq + 1;
                map.put(ch, new_freq);
            }
        }

        char maxch = str.charAt(0);
        int max_freq = map.get(maxch);

        for (char ch : map.keySet()) {
            int val = map.get(ch);

            if (val > max_freq) {
                max_freq = val;
                maxch = ch;
            }
        }

        System.out.println(maxch);
    }
}

/*
 * 1. You are given a string str.
 * 2. You are required to find the character with maximum frequency.
 * 
 * Input -> zmszeqxllzvheqwrofgcuntypejcxovtaqbnqyqlmrwitc
 * Output -> q
 */
