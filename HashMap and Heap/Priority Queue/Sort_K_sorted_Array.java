import java.io.*;
import java.util.*;

public class Sort_K_sorted_Array {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int k = Integer.parseInt(br.readLine());
        // 1st Method
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            if (i < k + 1) {
                pq.add(arr[i]);
            } else {
                System.out.println(pq.remove());
                pq.add(arr[i]);
            }
        }

        while (pq.size() > 0) {
            System.out.println(pq.remove());
        }

        // 2nd Method
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // Add first k+1 elements to the Priority Queue
        // for (int i = 0; i <= k; i++) {
        // pq.add(arr[i]);
        // }

        // // Filter out the smallest element and move funnel to the next positions
        // for (int i = k + 1; i < n; i++) {
        // // 1-> remove and print the smallest ele in pq
        // System.out.println(pq.remove());
        // // 2-> Add Other elements
        // pq.add(arr[i]);
        // }

        // // Array is completely traversed, empty the funnel now
        // while (pq.size() > 0) {
        // System.out.println(pq.remove());
        // }
    }

}

/*
 * 1. You are given a number n, representing the size of array a.
 * 2. You are given n numbers, representing elements of array a.
 * 3. The array is nearly sorted. Every element is at-max displaced k spots left
 * or right to it's position in the sorted array. Hence it is being called
 * k-sorted array.
 * 4. You are required to sort and print the sorted array.
 * 
 * Note -> You can use at-max k extra space and nlogk time complexity.
 * 
 * Input ->
 * 9
 * 3
 * 2
 * 4
 * 1
 * 6
 * 5
 * 7
 * 9
 * 8
 * 3
 * 
 * Output ->
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 */
