/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    ArrayList<Integer> result = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        inorder(root);
        int flag = 0;
        for(int a = 0;a<result.size()-1;a++){
            if(result.get(a)<result.get(a+1)){
                continue;
            }
            else{
                flag=1;
            }

        }
        return flag==0;
        
    }
    void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        result.add(root.val);
        inorder(root.right);
    }
}
