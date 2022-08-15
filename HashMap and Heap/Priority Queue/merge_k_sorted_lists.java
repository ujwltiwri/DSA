import java.io.*;
import java.util.*;

public class merge_k_sorted_lists {
    public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists) {
        ArrayList<Integer> rv = new ArrayList<>();

        PriorityQueue<pair> pq = new PriorityQueue<>((pair a, pair b) -> {
            return a.data - b.data;
        });

        for (int i = 0; i < lists.size(); i++) {
            // add data of 0th idx from all array lists
            pair p = new pair(i, 0, lists.get(i).get(0));
            pq.add(p);
        }

        while (pq.size() > 0) {
            // remove pair from pq on basis of -> smallest data
            pair p = pq.remove();
            // add smallest data into ArrayList
            rv.add(p.data);
            // Increase Data Index of Pair
            p.di++;

            if (p.di < lists.get(p.li).size()) { // check if the array list contains enough data or not
                p.data = lists.get(p.li).get(p.di); // If Yes -> Change data of pair from last one to new index
                pq.add(p);
            }
        }

        return rv;
    }

    public static class pair {
        int li;
        int di;
        int data;

        pair(int li, int di, int data) {
            this.li = li;
            this.di = di;
            this.data = data;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            ArrayList<Integer> list = new ArrayList<>();

            int n = Integer.parseInt(br.readLine());
            String[] elements = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                list.add(Integer.parseInt(elements[j]));
            }

            lists.add(list);
        }

        ArrayList<Integer> mlist = mergeKSortedLists(lists);
        for (int val : mlist) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

}

/*
 * 1. You are given a list of lists, where each list is sorted.
 * 2. You are required to complete the body of mergeKSortedLists function. The
 * function is expected to merge k sorted lists to create one sorted list.
 * 
 * Input ->
 * 4 -> Total No of Lists
 * 5 -> Size of List Per Index
 * 10 20 30 40 50
 * 7
 * 5 7 9 11 19 55 57
 * 3
 * 1 2 3
 * 2
 * 32 39
 * 
 * Output ->
 * 1 2 3 5 7 9 10 11 19 20 30 32 39 40 50 55 57
 */
