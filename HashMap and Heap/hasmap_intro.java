import java.io.*;
import java.util.*;

public class hasmap_intro {

    public static void main(String[] args) throws Exception {
        HashMap<String, Integer> map = new HashMap<>();

        /*
         * 1. map.put -> if key doesn't exist then insert a new one
         * else update the previous
         */
        map.put("India", 3);
        map.put("USA", 2);
        map.put("France", 1);
        map.put("India", 4); // here India's Key Will Be Updated From 2 to 4

        /* ******************************************************************* */

        /*
         * 2. map.get() -> if key exist you will get value
         * else you will get null
         */
        int val = map.get("India");
        // int val = map.get("US");
        System.out.println(val);

        /* ******************************************************************* */

        /*
         * 3. map.containsKey() -> if key exist you will get -> true
         * else you will get -> false
         */
        boolean ans = map.containsKey("USA");
        System.out.println(ans);

        /* ******************************************************************* */

        /* 4. Print the Hashmap -> Using keySet() */
        for (String s : map.keySet()) {
            int keyval = map.get(s); // key will be printed
            System.out.println(s + " -> " + keyval); // key is printed
        }

        /* ******************************************************************* */

        /*
         * 5. getOrDefault -> Means 1st if key exists then You will get Value
         * else Default Value Which You Have Set Will Be Returned
         */

        int answer = map.getOrDefault("US", 0 /* USA is Get & 0 Is Default Value Here */);
        System.out.println(answer);

        /* ******************************************************************* */

    }

}
