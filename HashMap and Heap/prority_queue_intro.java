import java.util.*;
import java.lang.*;
import java.io.*;

class prority_queue_intro {
    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        solve(n, num, k);
    }

    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input an array,n length of array and k.
    // It should print required output.
    public static void solve(int n, int[] arr, int k) {
        // Priority Queue Introduction
        /* This is Normal Priority Queue -> Elements Are Added & Removed in Normal Order i.e. Increasing -> Low to High */ 
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        /* This is Reversed Priority Queue -> Elements Are Added & Removed in Reversed Order i.e. Decreasing -> High to Low */
        // 1-> Add into Priority Queue
        pq.add(5);
        pq.add(10);
        pq.add(13);
        pq.add(8);

        // 2-> Remove Elements from Priority Queue
        // pq.remove() -> It removes Elements in Sorted Order from Smallest to Largest

        while (pq.size() > 0) {
            System.out.println(pq.remove()); // So Here Elements Will Be Removed In Sorted Order -> Increasing Order
        }

        // 3 -> You Can Access the Top Most Element in Priority Queue By Using Peek()
        System.out.println(pq.peek()); // 5 -> In Case of Normal Priority Queue
        System.out.println(pq.peek()); // 13 -> In Case of Reversed Priority Queue

    }
}