import java.io.*;
import java.util.*;

public class tower_of_hanoi {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int t1id = scn.nextInt();
        int t2id = scn.nextInt();
        int t3id = scn.nextInt();
        toh(n, t1id, t2id, t3id);
    }

    public static void toh(int n, int t1id, int t2id, int t3id) {
        if (n == 0) {
            return;
        }

        toh(n - 1, t1id, t3id, t2id);
        System.out.println(n + "[" + t1id + " -> " + t2id + "]");
        toh(n - 1, t3id, t2id, t1id);
    }

}

/*
 * 1. There are 3 towers. Tower 1 has n disks, where n is a positive number.
 * Tower 2 and 3 are empty. 2. The disks are increasingly placed in terms of
 * size such that the smallest disk is on top and largest disk is at bottom. 3.
 * You are required to 3.1. Print the instructions to move the disks. 3.2. from
 * tower 1 to tower 2 using tower 3 3.3. following the rules 3.3.1 move 1 disk
 * at a time. 3.3.2 never place a smaller disk under a larger disk. 3.3.3 you
 * can only move a disk at the top. Note -> The online judge can't force you to
 * write the function recursively but that is what the spirit of question
 * is.Write recursive and not iterative logic. The purpose of the question is to
 * aid learning recursion and not test you.
 */

/*
 * Input->
 * 3
 * 1
 * 2
 * 3
 * Output ->
 * 1[1 -> 2]
 * 2[1 -> 3]
 * 1[2 -> 3]
 * 3[1 -> 2]
 * 1[3 -> 1]
 * 2[3 -> 2]
 * 1[1 -> 2]
 */