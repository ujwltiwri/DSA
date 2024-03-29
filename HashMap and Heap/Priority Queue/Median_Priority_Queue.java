import java.io.*;
import java.util.*;

public class Median_Priority_Queue {

    public static class MedianPriorityQueue {
        PriorityQueue<Integer> left;
        PriorityQueue<Integer> right;

        public MedianPriorityQueue() {
            left = new PriorityQueue<>(Collections.reverseOrder());
            right = new PriorityQueue<>();
        }

        public void add(int val) {
            // Points 1-> Left PQ is Max Type of Pq
            // 2-> Right PQ is Min Type of PQ

            /*
             * right pq has atleast 1 ele & val (Input) is greater than right's peek -> In
             * That Case Add Val in Right PQ Otherwise Always Add in Left PQ
             */
            if (right.size() > 0 && val > right.peek()) {
                right.add(val);
            } else {
                left.add(val);
            }

            /*
             * If size gap b/w left or right PQ becomes more than 1 then remove the ele from
             * on side of pq and add to another side accordingly
             */
            if (left.size() - right.size() == 2) {
                right.add(left.remove());
            } else if (right.size() - left.size() == 2) {
                left.add(right.remove());
            }
        }

        public int remove() {
            if (this.size() == 0) {
                System.out.println("Underflow");
                return -1;
            } else if (left.size() >= right.size()) {
                return left.remove();
            } else {
                return right.remove();
            }
        }

        public int peek() {
            if (this.size() == 0) {
                System.out.println("Underflow");
                return -1;
            } else if (left.size() >= right.size()) {
                /* If Left's Size >= Right's Size -> Then Median will be at Left's Peek */
                return left.peek();
            } else { /* Otherwise At Right's Peek */
                return right.peek();
            }
        }

        public int size() {
            return left.size() + right.size();
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MedianPriorityQueue qu = new MedianPriorityQueue();

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

/*
 * Q Type -> Hard
 * 1. You are required to complete the code of our MedianPriorityQueue class.
 * The class should mimic the behaviour of a PriorityQueue and give highest
 * priority to median of it's data.
 * 2. Here is the list of functions that you are supposed to complete
 * 2.1. add -> Should accept new data.
 * 2.2. remove -> Should remove and return median value, if available or print
 * "Underflow" otherwise and return -1
 * 2.3. peek -> Should return median value, if available or print "Underflow"
 * otherwise and return -1
 * 2.4. size -> Should return the number of elements available
 * 3. Input and Output is managed for you.
 * 
 * Note -> If there are even number of elements in the MedianPriorityQueue,
 * consider the smaller median as median value.
 * 
 * Input ->
 * add 10
 * add 20
 * add 30
 * add 40
 * peek
 * add 50
 * peek
 * remove
 * peek
 * remove
 * peek
 * remove
 * peek
 * remove
 * peek
 * quit
 * 
 * Output ->
 * 20
 * 30
 * 30
 * 20
 * 20
 * 40
 * 40
 * 10
 * 10
 * 50
 */
