import java.util.ArrayList;
import java.util.Arrays;

public class Q297 {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        String res = "";
        return serial(root, res);
    }

    public String serial(TreeNode root, String res) {
        if (root == null) {
            res += "null,";
            return res;
        }

        res += root.val;
        res += ",";
        res = serial(root.left, res);
        res = serial(root.right, res);
        return res;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));
        return deserial(list);
    }
    private TreeNode deserial(ArrayList<String> arr) {
        String cur = arr.remove(0);
        if (cur.isEmpty()) {
            return null;
        }
        if (cur.equals("null") ) {
            return null;
        }

        TreeNode node = new TreeNode(Integer.valueOf(cur));
        node.left = deserial(arr);
        node.right = deserial(arr);
        return node;
    }
}
