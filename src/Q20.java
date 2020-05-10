import java.util.Stack;

class Q20 {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char cur : s.toCharArray()) {
            if (cur == '(' || cur == '{' || cur == '[') {
                st.push(cur);
            } else if (cur == ')' || cur == '}' || cur == ']') {
                if (st.isEmpty()) {
                    return false;
                } else {
                    char pre = st.pop();
                    if (cur == ')' && pre != '(') {
                        return false;
                    } else if (cur == '}' && pre != '{') {
                        return false;
                    } else if (cur == ']' && pre != '[') {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        return st.isEmpty();
    }
}
