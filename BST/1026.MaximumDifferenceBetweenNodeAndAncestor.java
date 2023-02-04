package BST;

// 1026. Maximum Difference Between Node and Ancestor
class MaximumDifferenceBetweenNodeAndAncestor {

    public static void main(String[] args) {

    }

    int ans = 0;

    public int maxAncestorDiff(TreeNode root) {
        bst(root.left, root.val, root.val);
        bst(root.right, root.val, root.val);
        return ans;
    }

    public void bst(TreeNode root, int max, int min) {
        if (root == null)
            return;

        if (Math.abs(root.val - max) > ans)
            ans = Math.abs(root.val - max);
        if (Math.abs(root.val - min) > ans)
            ans = Math.abs(root.val - min);

        if (root.val > max)
            max = root.val;
        else if (root.val < min)
            min = root.val;

        bst(root.left, max, min);
        bst(root.right, max, min);
    }

}
