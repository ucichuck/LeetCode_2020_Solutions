class WordDictionary {
    TreeNode head;

    /** Initialize your data structure here. */
    public WordDictionary() {
        head = new TreeNode(false);
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        TreeNode cur = head;
        for (int i = 0; i < word.length(); i++) {
            char wc = word.charAt(i);
            int index = wc - 'a';
            if (cur.next[index] == null) {
                cur.next[index] = new TreeNode(false);
            }
            
            if (i == word.length() -1) {
                cur.next[index].isWordEnd = true;
            }
            cur = cur.next[index];
        }
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return search(word, head, 0);
    }
    
    private boolean search(String word, TreeNode head, int index) {
        if (index == word.length()) {
            return head.isWordEnd;
        }
        char cur = word.charAt(index);
        if (cur == '.') {
           for (int i = 0; i < head.next.length; i++) {
               if (head.next[i] != null) {
                   if (search(word, head.next[i], index+1)) {
                    return true;
                   }
               }
           } 
        } else {
            int curIndex = cur - 'a';
            if (head.next[curIndex] == null) {
                return false;
            } else {
                if (search(word, head.next[curIndex], index+1)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    class TreeNode {
        TreeNode[] next;
        boolean isWordEnd;
        
        TreeNode(boolean isWordEnd) {
            this.isWordEnd = isWordEnd;
            next = new TreeNode[26];
        }
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
