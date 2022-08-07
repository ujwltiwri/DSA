import java.io.*;
import java.util.*;

public class write_hashmap {

    public static class HashMap<K, V> {
        private class HMNode {
            K key;
            V value;

            HMNode(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int size; // n
        private LinkedList<HMNode>[] buckets; // N = buckets.length

        public HashMap() {
            initbuckets(4);
            size = 0;
        }

        private void initbuckets(int N) {
            buckets = new LinkedList[N];
            for (int bi = 0; bi < buckets.length; bi++) {
                buckets[bi] = new LinkedList<>();
            }
        }

        /* This is Important */

        // to get bucket index -> bi (Bucket Index)
        private int hashFunction(K key) {
            int hcode = key.hashCode();
            int bi /* (Bucket Index) */ = Math.abs(hcode) % buckets.length;
            return bi;
        }

        /* This is Important */
        // to get data index -> (index of specific data) in a particular bucket
        private int findInBucket(int bi, K key) {
            int di = 0; // data index

            for (HMNode node : buckets[bi]) {
                if (node.key.equals(key)) { // if the passed key matches with the key in node then return the index
                    return di;
                } else {
                    di++;
                }
            }

            // if no key is found in the bucket index of nodes then return -1;
            return -1;
        }

        /* This is Important */
        private void reHash() throws Exception {
            LinkedList<HMNode>[] old = buckets; // this has the value of buckets array
            initbuckets(2 * old.length); // now size of new buckets arr will be double the previous size
            size = 0;

            // now removing the data from prev buckets arr to new buckets arr
            for (int bi = 0; bi < old.length; bi++) {
                for (HMNode node : old[bi]) {
                    put(node.key, node.value);
                }
            }
        }

        // put is used to update the value if data is found else add the value at last
        // of the node
        public void put(K key, V value) throws Exception {
            int bi = hashFunction(key);
            int di = findInBucket(bi, key);

            if (di == -1) {
                HMNode node = new HMNode(key, value);
                buckets[bi].addLast(node);
                size++;
            } else {
                HMNode node = buckets[bi].get(di);
                node.value = value;
            }

            // calling rehash function to rehash the hasmap if size exceeds
            double lambda = size * 1.0 / buckets.length;
            if (lambda > 2.0) {
                reHash();
            }

        }

        public V get(K key) throws Exception {
            int bi = hashFunction(key);
            int di = findInBucket(bi, key);

            if (di == -1) {
                return null;
            } else {
                HMNode node = buckets[bi].get(di);
                return node.value;
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = findInBucket(bi, key);

            if (di == -1) {
                return false;
            } else {
                return true;
            }
        }

        public V remove(K key) throws Exception {
            int bi = hashFunction(key);
            int di = findInBucket(bi, key);

            if (di == -1) {
                return null;
            } else {
                HMNode node = buckets[bi].remove(di);
                size--;
                return node.value;
            }
        }

        public ArrayList<K> keyset() throws Exception {
            ArrayList<K> set = new ArrayList<K>();

            for (int bi = 0; bi < buckets.length; bi++) {
                for (HMNode node : buckets[bi]) {
                    set.add(node.key);
                }
            }

            return set;
        }

        public int size() {
            return size;
        }

        public void display() {
            System.out.println("Display Begins");
            for (int bi = 0; bi < buckets.length; bi++) {
                System.out.print("Bucket" + bi + " ");
                for (HMNode node : buckets[bi]) {
                    System.out.print(node.key + "@" + node.value + " ");
                }
                System.out.println(".");
            }
            System.out.println("Display Ends");
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("put")) {
                String[] parts = str.split(" ");
                String key = parts[1];
                Integer val = Integer.parseInt(parts[2]);
                map.put(key, val);
            } else if (str.startsWith("get")) {
                String[] parts = str.split(" ");
                String key = parts[1];
                System.out.println(map.get(key));
            } else if (str.startsWith("containsKey")) {
                String[] parts = str.split(" ");
                String key = parts[1];
                System.out.println(map.containsKey(key));
            } else if (str.startsWith("remove")) {
                String[] parts = str.split(" ");
                String key = parts[1];
                System.out.println(map.remove(key));
            } else if (str.startsWith("size")) {
                System.out.println(map.size());
            } else if (str.startsWith("keyset")) {
                System.out.println(map.keyset());
            } else if (str.startsWith("display")) {
                map.display();
            }
            str = br.readLine();
        }
    }
}
