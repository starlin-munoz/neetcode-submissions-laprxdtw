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

    public int helper(TreeNode root, int maxVal){
        if(root == null){
            return 0;
        }

        int result = 0;
        if(root.val >= maxVal){
            result = 1;
        }

        if(root.val > maxVal){
            maxVal = root.val;
        }

        result += helper(root.left, maxVal);
        result += helper(root.right, maxVal);

        return result;
    }

    public int goodNodes(TreeNode root) {
        return helper(root, root.val);
    }
}