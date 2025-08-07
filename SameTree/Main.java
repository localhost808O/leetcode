class Solution {
    private boolean isSameTree = true;
    
    private void equal(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return;
        }
        if (root1 == null || root2 == null) {
            this.isSameTree = false;
            return;
        }
        if (root1.val != root2.val) {
            isSameTree = false;
        } else {
            equal(root1.right, root2.right);
            equal(root1.left, root2.left);
        }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        equal(p, q);
        return this.isSameTree;
    }
}
