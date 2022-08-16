import java.io.*;
import java.util.*;

public class Write_Priority_Queue_Using_Heap {

    public static class PriorityQueue {
        ArrayList<Integer> data;

        public PriorityQueue() {
            data = new ArrayList<>();
        }

        public void add(int val) {
            data.add(val);
            upheapify(data.size() - 1);
        }

        public void upheapify(int ci) {
            // ci -> Child Index
            if (ci == 0) { // Base Case
                return;
            }

            int pi = (ci - 1) / 2;

            if (data.get(pi) > data.get(ci)) {
                swap(data, pi, ci);
                upheapify(pi);
            }
        }

        public void swap(ArrayList<Integer> data, int pi, int ci) {
            int parent = data.get(pi);
            int child = data.get(ci);

            data.set(pi, child);
            data.set(ci, parent);
        }

        public int remove() {
            // Base Case
            if (data.size() == 0) {
                System.out.println("Underflow");
                return -1;
            }

            swap(data, 0, data.size() - 1); // swap 0th idx ele with last idx ele

            int val = data.remove(data.size() - 1);
            downheapify(0); // this func will also be called on 0th idx

            return val;

        }

        public void downheapify(int pi) {
            int mini = pi;

            int lci = 2 * pi + 1; // Left Child Index
            if (lci < data.size() && data.get(lci) < data.get(mini)) {
                /*
                 * will change value only if data of lci is less than data in mini -> if on top
                 * (mini) data is 10 and in lci data is 20 -> Then Data (Mini) Won't Be Changed
                 * / Swapped
                 */
                mini = lci;
            }

            int rci = 2 * pi + 2; // Right Child Index
            if (rci < data.size() && data.get(rci) < data.get(mini)) {
                /*
                 * will change value only if data of lci is less than data in mini -> if on top
                 * (mini) data is 10 and in rci data is 8 -> Then Data (Mini) Will Be Changed &
                 * mini = rci i.e. 8 / Swapped
                 */
                mini = rci;
            }

            if (pi != mini) { // if we get same data in pi & mini also then we won't swap
                swap(data, mini, pi);
                downheapify(mini);
            }
        }

        public int peek() {
            if (data.size() == 0) {
                System.out.println("Underflow");
                return -1;
            } else {
                return data.get(0);
            }
        }

        public int size() {
            return data.size();
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue qu = new PriorityQueue();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("add")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                qu.add(val);
            } else if (str.startsWith("remove")) {
                int val = qu.remove();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("peek")) {
                int val = qu.peek();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("size")) {
                System.out.println(qu.size());
            }
            str = br.readLine();
        }
    }
}
