class Solution {
    public int sum = 0;

    public void getRightNode(TreeNode root) {
        if(root == null) {
            return;
        }
        getRightNode(root.right);
        int tmp = root.val;
        root.val += sum;
        sum+= tmp;
        getRightNode(root.left);
    }

    public TreeNode convertBST(TreeNode root) {
        getRightNode(root);
        return root;
    }
}
