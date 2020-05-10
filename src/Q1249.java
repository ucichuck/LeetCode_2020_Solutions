public class Q1249 {
    class Solution {
        public String minRemoveToMakeValid(String s) {
            int left = 0;
            int right = 0;
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char cur = s.charAt(i);
                if (cur == '(') {
                    left++;
                    res.append(cur);
                } else if (cur == ')') {
                    if (left > 0) {
                        left--;
                        res.append(cur);
                    }
                } else {
                    res.append(cur);
                }
            }

            s = res.toString();
            res = new StringBuilder();
            for (int i = s.length() - 1; i>=0; i-- ) {
                char cur = s.charAt(i);
                if (cur == ')') {
                    right++;
                    res.append(cur);
                } else if (cur == '(') {
                    if (right > 0) {
                        right --;
                        res.append(cur);
                    }
                } else {
                    res.append(cur);
                }
            }

            s = res.toString();
            res = new StringBuilder();
            for (int i = s.length() - 1; i>=0; i-- ) {
                res.append(s.charAt(i));
            }
            return res.toString();
        }
    }
}
