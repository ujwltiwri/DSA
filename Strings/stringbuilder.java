import java.io.*;
import java.util.*;

public class stringbuilder {

    public static void solution(String str) {
        // write your code here
        StringBuilder sb = new StringBuilder(str);

        sb.length(); // -> to get length
        sb.append('s'); // to add in last
        sb.insert(1, "a"); // -> to insert in between
        sb.setCharAt(0, 'c'); // -> to change character
        sb.deleteCharAt(0); // -> to delete a specific index
        sb.toString(); // -> to change from StringBuilder to string

        System.out.println(sb);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }

}