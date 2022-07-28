import java.io.*;
import java.util.*;

public class get_maze_path_with_jumps {

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

        ArrayList<String> horizontal = new ArrayList<>();
        ArrayList<String> vertical = new ArrayList<>();
        ArrayList<String> diagnol = new ArrayList<>();

        ArrayList<String> myans = new ArrayList<>();

        for (int jump = 1; sc + jump <= dc; jump++) {
            horizontal = getMazePaths(sr, sc + jump, dr, dc);

            for (String s : horizontal)
                myans.add("h" + jump + s);
        }

        for (int jump = 1; sr + jump <= dr; jump++) {
            vertical = getMazePaths(sr + jump, sc, dr, dc);

            for (String s : vertical)
                myans.add("v" + jump + s);
        }

        for (int jump = 1; sc + jump <= dc && sr + jump <= dr; jump++) {
            diagnol = getMazePaths(sr + jump, sc + jump, dr, dc);

            for (String s : diagnol)
                myans.add("d" + jump + s);
        }

        return myans;
    }

}

/*
 * 1. You are given a number n and a number m representing number of rows and
 * columns in a maze.
 * 2. You are standing in the top-left corner and have to reach the bottom-right
 * corner.
 * 3. In a single move you are allowed to jump 1 or more steps horizontally (as
 * h1, h2, .. ), or 1 or more steps vertically (as v1, v2, ..) or 1 or more
 * steps diagonally (as d1, d2, ..).
 * 
 * input -> 2 2
 * Output -> [h1v1, v1h1, d1]
 */
