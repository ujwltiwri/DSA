import java.io.*;
import java.util.*;

public class longest_consecutive_sequence_of_elements {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        HashMap<Integer, Boolean> map = new HashMap<>();

        // 1-> make all elements true
        for (int ele : arr) {
            map.put(ele, true);
        }

        // 2-> make those elements false whose previous value exists -> like make 5
        // false if 4 exists
        for (int ele : arr) {
            if (map.containsKey(ele - 1)) {
                map.put(ele, false);
            }
        }

        int maxlen = 0;
        int starting_point = 0;

        for (int key : map.keySet()) {
            if (map.get(key) == true) {
                int length = 1; // if got true then length will be 1 -> Initially
                int start = key; // and start position is the key of element

                while (map.containsKey(start + length)) {
                    length++; // if key + length exists then -> length++
                    /* if 5 exists then 5 + 1 = 6 -> then length++ 6 -> 7 */
                }

                if (length > maxlen) {
                    maxlen = length;
                    starting_point = start;
                }
            }
        }

        for (int i = 0; i < maxlen; i++) {
            System.out.println(starting_point + i);
        }
    }

}

/*
 * 1. You are given a number n, representing the size of array a.
 * 2. You are given n numbers, representing elements of array a.
 * 3. You are required to print the longest sequence of consecutive elements in
 * the array (ignoring duplicates).
 * 
 * Note -> In case there are two sequences of equal length (and they are also
 * the longest), then print the one for which the starting point of which occurs
 * first in the array.
 * 
 * Input ->
 * 17
 * 12
 * 5
 * 1
 * 2
 * 10
 * 2
 * 13
 * 7
 * 11
 * 8
 * 9
 * 11
 * 8
 * 9
 * 5
 * 6
 * 11
 * 
 * Output ->
 * 5
 * 6
 * 7
 * 8
 * 9
 * 10
 * 11
 * 12
 * 13
 */
