import java.util.ArrayList;

/**
 * The read4 API is defined in the parent class Reader4.
 *     int read4(char[] buf); 
 */

public class Q158 extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Number of characters to read
     * @return    The number of actual characters read
     */
    private ArrayList<Character> cache;
    public int read(char[] buf, int n) {
        if (n <= 0) {
            return n;
        }
        
        if (cache == null) {
            cache = new ArrayList<>();
        }
        
        int nextIndex = Math.min(n, cache.size());
        int index = 0;
        for (; index < nextIndex; index ++) {
            buf[index] = cache.remove(0);
        }
        
        if (nextIndex == n) {
            return index;
        }
        
        while (index < n) {
            char[] tmp = new char[4];
            int num = read4(tmp);
            if (num == 0) {
                return index;
            }
            
            nextIndex = Math.min(num, n - index);
            for (int i = 0; i < nextIndex; i++) {
                buf[index++] = tmp[i];
            }
            while (nextIndex < num) {
                cache.add(tmp[nextIndex++]);
            }
        }
        return index;
    }
}
