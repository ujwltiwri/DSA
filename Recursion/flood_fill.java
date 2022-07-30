import java.io.*;
import java.util.*;

public class flood_fill {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] maze = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                maze[i][j] = scn.nextInt();
            }
        }

        boolean[][] visited = new boolean[n][m];
        floodfill(maze, 0, 0, "", visited);
    }

    static int[][] direction = { { -1, 0 }, { 0, -1 }, { 1, 0 }, { 0, 1 } };
    static String[] direction_name = { "t", "l", "d", "r" };

    // asf -> answer so far
    public static void floodfill(int[][] maze, int sr, int sc, String asf, boolean[][] visited) {

        if (sr == maze.length - 1 && sc == maze[0].length - 1) {
            System.out.println(asf);
            return;
        }

        // if(sr < 0 || sc < 0 || sr == maze.length || sc == maze[0].length /* -> Till
        // Here Checking If We Went Out of The Matrix */ || maze[sr][sc] == 1 ||
        // visited[sr][sc] == true /*Here If Value is 1 and If Visited Value is True,
        // Then Also Don't Go */){
        // return;
        // }

        // asf -> Answer So Far

        visited[sr][sc] = true;

        // floodfill(maze, sr - 1, sc, asf + "t", visited); // -> Top Call
        // floodfill(maze, sr, sc - 1, asf + "l", visited); // -> Left Call
        // floodfill(maze, sr + 1, sc, asf + "d", visited); // -> Down Call
        // floodfill(maze, sr, sc + 1, asf + "r", visited); // -> Top Call

        /*
         * More Optimized Approach With The Help of a 2d Array to decide whether to call
         * or not
         */
        for (int d = 0; d < direction.length; d++) {
            int row = sr + direction[d][0];
            int col = sc + direction[d][1];

            if (row >= 0 && col >= 0 && row < maze.length
                    && col < maze[0].length /* Till Here Checking If We Are Inside The Matrix */ && maze[row][col] == 0
                    && visited[row][col] == false /* Here If Value is 0 and If Visited Value is False, Then Only Call */) {
                floodfill(maze, row, col, asf + direction_name[d], visited);
            }
        }

        visited[sr][sc] = false;

    }
}

/*
 * 1. You are given a number n, representing the number of rows.
 * 2. You are given a number m, representing the number of columns.
 * 3. You are given n*m numbers, representing elements of 2d array a. The
 * numbers can be 1 or 0 only.
 * 4. You are standing in the top-left corner and have to reach the bottom-right
 * corner.
 * Only four moves are allowed 't' (1-step up), 'l' (1-step left), 'd' (1-step
 * down) 'r' (1-step right). You can only move to cells which have 0 value in
 * them. You can't move out of the boundaries or in the cells which have value 1
 * in them (1 means obstacle)
 * 5. Complete the body of floodfill function - without changing signature - to
 * print all paths that can be used to move from top-left to bottom-right.
 * 
 * Input ->
 * 3 3
 * 0 0 0
 * 1 0 1
 * 0 0 0
 * 
 * Output -> rddr
 */