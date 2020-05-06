import java.util.Stack;

public class Q227_SO {

    public int calculate(String s) {
        if (s == null || s.isEmpty()) return 0;
        boolean negative = false;
        Stack<Character> st = new Stack<>();
        boolean hasExp = false;

        for (int i = s.length() - 1; i>= 0; i--) {
            char cur = s.charAt(i);
            if (cur >= '0' && cur <= '9') {
                st.push(cur);
            } else if (cur == '+' || cur == '-' || cur == '*' || cur == '/') {
                if (!hasExp) {
                    st.push(cur);
                    hasExp = true;
                } else {
                    int cal = calculateStack(st);
                    System.out.println("calculateStack: " + cal);
                    if (cal == 0) {
                        st.push('0');
                    } else {
                        if (cal < 0) {
                            negative = !negative;
                            cal = cal * (-1);
                        }
                        while (cal > 0) {
                            st.push((char)((cal%10)+'0'));
                            cal = cal / 10;
                        }
                    }
                    st.push(cur);
                    hasExp = true;
                }
            }

        }
        if (negative) return calculateStack(st) * (-1);
        return calculateStack(st);
    }

    private int calculateStack(Stack<Character> st) {
        if(st.isEmpty()) return 0;

        int left = getFirstNum(st);
        if(st.isEmpty()) return left;
        char oper = st.pop();
        int right = getFirstNum(st);

        if (oper == '+') {
            return left + right;
        } else if (oper == '-') {
            return left - right;
        } else if (oper == '*') {
            return left * right;
        } else {
            return left / right;
        }
    }

    private int getFirstNum(Stack<Character> st) {
        if(st.isEmpty()) return 0;
        int res = 0;
        while (!st.isEmpty() && (st.peek() >= '0' && st.peek() <= '9')) {
            res = res*10 + (st.pop() - '0');
        }
        System.out.println("getFirstNum: " + res);
        return res;
    }
}
