
// import java.io.*;
import java.util.*;

public class array_list_demo {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        ArrayList<Integer> al = new ArrayList<>();

        al.add(10); // to add in last idx -> al.add(val)
        al.add(20); // to add in last idx -> al.add(val)
        al.add(30); // to add in last idx -> al.add(val)

        al.add(0, 40); // to add at specific idx -> a1.add(idx, val)

        al.set(0, 50); // to change the value at specific index -> a1.set(idx, val)

        al.remove(0); // to remove the specific index

        // ************ Output ************
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

        // ************ Using For Each ************
        for (int val : al) {
            System.out.println(val);
        }

        scn.close();
    }

}
