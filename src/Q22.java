import java.util.ArrayList;
import java.util.List;

class Q22 {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        if (n <= 0) {
            res.add("");
            return res;
        }
        
        generatePa(res, "", 0, 0, n);
        return res;
    }
    
    private void generatePa(List<String> res, String cur, int left, int right, int n) {
        if (left == n && right == n) {
            res.add(cur);
            return;
        }
        
        if (left < n) {
             generatePa(res, cur + '(', left + 1, right, n);
        }
        
        if (right < left) {
             generatePa(res, cur + ')', left, right + 1, n);
        }
    }
}
