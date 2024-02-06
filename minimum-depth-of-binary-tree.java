class Solution {
public int minDepth(TreeNode root) {
    if (root == null) {
        return 0;
    }

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    int miniDepthTree = 0;
    while (!queue.isEmpty()) {
        miniDepthTree++;
        int sizeLevel = queue.size();

        for (int i = 0; i < sizeLevel; i++) {
            TreeNode currNode = queue.poll();

            if (currNode.left == null && currNode.right == null) {
                return miniDepthTree;
            }

            if (currNode.left != null) {
                queue.add(currNode.left);
            }
            if (currNode.right != null) {
                queue.add(currNode.right);
            }
        }
    }

    return miniDepthTree;
}
}
