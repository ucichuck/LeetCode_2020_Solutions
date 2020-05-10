/**
 * The read4 API is defined in the parent class Reader4.
 *     int read4(char[] buf);
 */

public class Solution extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Number of characters to read
     * @return    The number of actual characters read
     */
    public int read(char[] buf, int n) {
        if (n <= 0) {
            return n;
        }
        
        int index = 0;
        while (index < n) {
            char[] tmp = new char[4];
            int num = read4(tmp);
            if (num == 0) {
                return index;
            }
            
            int nextIndex = Math.min(num, n - index);
            for (int i = 0; i < nextIndex; i++) {
                buf[index++] = tmp[i];
            }
        }
        
        return index;
    }
}
