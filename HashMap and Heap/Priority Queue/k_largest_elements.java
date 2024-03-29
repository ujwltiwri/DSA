import java.util.*;
import java.lang.*;
import java.io.*;

class K_largest_elements {
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
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            if (i < k) {
                pq.add(arr[i]);
            } else {
                if (arr[i] > pq.peek()) {
                    pq.remove();
                    pq.add(arr[i]);
                }
            }
        }

        // 1-> Using Stack
        // make a stack to add elements in reverse order
        Stack<Integer> stk = new Stack<>();

        while (pq.size() > 0) {
            stk.push(pq.remove()); // pushing ele to stack by removing them from Priority Queue
        }

        while (stk.size() > 0) {
            System.out.print(stk.pop() + " ");
        }

        // 2-> Using ArrayList
        // ArrayList<Integer> al = new ArrayList<>();

        // for(int i = 0; i < k; i++){
        // al.add(pq.remove());
        // }

        // for(int i = al.size()-1; i >= 0; i--){
        // System.out.print(al.get(i) + " ");
        // }
    }
}