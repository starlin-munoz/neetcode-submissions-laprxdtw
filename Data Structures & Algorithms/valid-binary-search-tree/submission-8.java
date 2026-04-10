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
    public boolean helper(long left, TreeNode root, long right){
        if(root == null){
            return true;
        }

        if(!(left < root.val && right > root.val)){
            return false;
        }

        return helper(left, root.left, root.val) && helper(root.val, root.right, right);
    }

    public boolean isValidBST(TreeNode root) {
        return helper(Long.MIN_VALUE, root, Long.MAX_VALUE);
    }
}
