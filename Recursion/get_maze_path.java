import java.io.*;
import java.util.*;

public class get_maze_path {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        System.out.println(getMazePaths(0, 0, n - 1, m - 1));
    }

    // sr - source row = 0
    // sc - source column = 0
    // dr - destination row = n-1
    // dc - destination column = m-1
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> pos = new ArrayList<>();
            pos.add("");
            return pos;
        }
        // Another method to handel -ve base case
        // if(sr == dr + 1 || sc == dc + 1){
        // return new ArrayList<>();
        // }

        ArrayList<String> horizontal = new ArrayList<>();
        ArrayList<String> vertical = new ArrayList<>();

        if (sc + 1 <= dc)
            horizontal = getMazePaths(sr, sc + 1, dr, dc); // for single line code we don't need curly braces
        if (sr + 1 <= dr)
            vertical = getMazePaths(sr + 1, sc, dr, dc);

        ArrayList<String> myans = new ArrayList<>();

        for (String s : horizontal)
            myans.add('h' + s); // for single line code we don't need curly braces

        for (String s : vertical)
            myans.add('v' + s);

        return myans;
    }

}

/*
 * 1. You are given a number n and a number m representing number of rows and
 * columns in a maze.
 * 2. You are standing in the top-left corner and have to reach the bottom-right
 * corner. Only two moves are allowed 'h' (1-step horizontal) and 'v' (1-step
 * vertical).
 * 
 * Input -> 3 3
 * Output -> [hhvv, hvhv, hvvh, vhhv, vhvh, vvhh]
 */