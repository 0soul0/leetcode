package BST;

// 938. Range Sum of BST
public class rangeSumofBST938 {
    public static void main(String[] args) {

    }

    int ans = 0;

    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null)
            return -1;
        if (root.val >= L && root.val <= R)
            ans += root.val;
        if (root.val > L)
            rangeSumBST(root.left, L, R);
        if (root.val < R)
            rangeSumBST(root.right, L, R);
        return ans;
    }

}
