import java.io.*;
import java.util.*;

public class Get_Common_Elements {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();

        int a1[] = new int[n1];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();

        int a2[] = new int[n2];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = scn.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int ele : a1) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        for (int ele : a2) {
            if (map.containsKey(ele)) {
                System.out.println(ele);
                map.remove(ele);
            }
        }

    }

}

/*
 * 1. You are given a number n1, representing the size of array a1.
 * 2. You are given n1 numbers, representing elements of array a1.
 * 3. You are given a number n2, representing the size of array a2.
 * 4. You are given n2 numbers, representing elements of array a2.
 * 5. You are required to print all elements of a2 which are also present in a1
 * (in order of their occurence in a2). Make sure to not print duplicates (a2
 * may have same value present many times).
 * 
 * Input -> 9 5 5 9 8 5 5 8 0 3 18 9 7 1 0 3 6 5 9 1 1 8 0 2 4 2 9 1 5 (input is
 * in new lines)
 * Output ->
 * 9
 * 0
 * 3
 * 5
 * 8
 */
