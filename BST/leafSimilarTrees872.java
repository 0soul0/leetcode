package BST;

import java.util.ArrayList;
import java.util.List;

// 872. Leaf-Similar Trees
public class leafSimilarTrees872 {
    public static void main(String[] args) {

    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leafs1 = new ArrayList<Integer>();
        List<Integer> leafs2 = new ArrayList<Integer>();
        bfs(root1, leafs1);
        bfs(root2, leafs2);
        return leafs1.equals(leafs2);
    }

    public void bfs(TreeNode root, List<Integer> leafs) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            leafs.add(root.val);
        }
        bfs(root.right, leafs);
        bfs(root.left, leafs);
    }

}
