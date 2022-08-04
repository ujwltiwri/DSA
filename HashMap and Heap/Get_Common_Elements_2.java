import java.io.*;

import java.util.*;

public class Get_Common_Elements_2 {

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

                map.put(ele, map.get(ele) - 1); // freq of the ele in hashmap will be reduced by 1

                if (map.get(ele) == 0) { // when freq (i.e. freq is stored in value) becomes zero
                    map.remove(ele); // then remove the key
                }
            }
        }

    }

}

/*
 * 1. You are given a number n1, representing the size of array a1. 2. You are
 * given n1 numbers, representing elements of array a1. 3. You are given a
 * number n2, representing the size of array a2. 4. You are given n2 numbers,
 * representing elements of array a2. 5. You are required to find the
 * intersection of a1 and a2. To get an idea check the example below: if a1 -> 1
 * 1 2 2 2 3 5 and a2 -> 1 1 1 2 2 4 5 intersection is -> 1 1 2 2 5 Note ->
 * Don't assume the arrays to be sorted.
 * 
 * Input ->
 * 7
 * 1
 * 1
 * 2
 * 2
 * 2
 * 3
 * 5
 * 7
 * 1
 * 1
 * 1
 * 2
 * 2
 * 4
 * 5
 * 
 * Output ->
 * 1
 * 1
 * 2
 * 2
 * 5
 */
