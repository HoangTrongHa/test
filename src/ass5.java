import java.util.Comparator;
import java.util.PriorityQueue;

public class ass5 {
    static class KeyComparator implements Comparator<Key> {
        public int compare(Key k1, Key k2) {
            if (k1.freq < k2.freq)
                return 1;
            else if (k1.freq > k2.freq)
                return -1;
            return 0;
        }
    }
    static class Key {
        int freq;
        char ch;
        Key(int val, char c) {
            freq = val;
            ch = c;
        }
    }
    static class GFG {
        static int MAX_CHAR = 26;
        static void rearrangeString(String str) {
            int n = str.length();

            int[] count = new int[MAX_CHAR];

            for (int i = 0; i < n; i++)
                count[str.charAt(i) - 'a']++;
            PriorityQueue<Key> pq = new PriorityQueue<>(new
                    KeyComparator());
            for (char c = 'a'; c <= 'z'; c++) {
                int val = c - 'a';
                if (count[val] > 0)
                    pq.add(new Key(count[val], c));
            }

            str = "";
            Key prev = new Key(-1, '#');

            while (pq.size() != 0) {
                Key k = pq.peek();
                pq.poll();
                str = str + k.ch;
                if (prev.freq > 0)
                    pq.add(prev);
                (k.freq)--;
                prev = k;
            }
            if (n != str.length())
                System.out.println("0");
            else
                System.out.println(str);
        }

        // Driver program to test above function
        public static void main(String[] args) {
            String str = "acneqeeeesss";
            rearrangeString(str);
        }
    }
}