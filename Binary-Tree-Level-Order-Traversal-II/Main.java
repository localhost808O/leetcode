class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        
        f(root, 0, result);
        Collections.reverse(result);
        return result;
    }
    
    private void f(TreeNode node, int level, List<List<Integer>> result) {
        if (node == null) return;
        if (level == result.size()) {
            result.add(new ArrayList<>());
        }
        
        result.get(level).add(node.val);
        
        buildLevels(node.left, level + 1, result);
        buildLevels(node.right, level + 1, result);
    }
}
