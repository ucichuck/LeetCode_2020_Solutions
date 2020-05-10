public class Q953 {
    class Solution {
        public boolean isAlienSorted(String[] words, String order) {
            return isAlienSorted(words, order.toCharArray());
        }

        private boolean isAlienSorted(String[] words, char[] order) {
            int[] table = new int[26];
            for (int i = 0; i < order.length; i++) {
                char tmp = order[i];
                table[tmp - 'a'] = i;
            }

            for (int i = 1; i < words.length; i++) {
                String word = words[i];
                String pre = words[i-1];

                int index = 0;
                while (index < word.length() && index < pre.length()) {
                    int wordPri = table[word.charAt(index) - 'a'];
                    int prePri = table[pre.charAt(index) - 'a'];

                    if (wordPri > prePri) {
                        break;
                    } else if (wordPri < prePri) {
                        return false;
                    } else {
                        index++;
                    }
                }
                if (index == word.length() && index< pre.length()) {
                    return false;
                }
            }
            return true;
        }
    }
}
