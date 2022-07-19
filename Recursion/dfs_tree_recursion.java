
/*
 * Depth First Search (DFS)

The DFS algorithm is a recursive algorithm that uses the idea of backtracking. It involves exhaustive searches of all the nodes by going ahead, if possible, else by backtracking.

Here, the word backtrack means that when you are moving forward and there are no more nodes along the current path, you move backwards on the same path to find nodes to traverse. All the nodes will be visited on the current path till all the unvisited nodes have been traversed after which the next path will be selected.
 */
import java.io.*;
import java.util.*;

public class dfs_tree_recursion {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pzz(n);
        scn.close();
    }

    public static void pzz(int n) {
        if (n == 0) {
            return;
        }

        System.out.println("Pre: " + n);
        pzz(n - 1);
        System.out.println("In: " + n);
        pzz(n - 1);
        System.out.println("Post: " + n);
    }

}