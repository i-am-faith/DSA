/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
import java.util.*;
class Solution {
    public List<Integer> postorder(Node root) {
        if(root == null)
        {
            return new ArrayList<>();
        }
        List<Integer> arrl = new ArrayList<>();
        dfs(root,arrl);
        return arrl;
    }
    public void dfs(Node root , List<Integer> arrl)
    {
        int n = root.children.size();
        for(int i=0;i<n;i++)
        {
            dfs(root.children.get(i),arrl);
        }
        arrl.add(root.val);
    }
}
