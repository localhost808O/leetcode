class Solution {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Node l = root;

        while (true) {
            if (l.left == null && l.right == null) {
                break;
            }
            Node currNode = l;

            while (currNode != null) {
                currNode.left.next = currNode.right;
                if (currNode.next != null) {
                    currNode.right.next = currNode.next.left;
                }
                currNode = currNode.next;
            }

            l = l.left;
        }

        return root;
    }
}
