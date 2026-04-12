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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> result = new ArrayList();

        q.add(root);
        while(!q.isEmpty()){
            TreeNode rightSide = null;
            int size = q.size();
            
            for(int i = 0; i < size; i++){
                TreeNode node = q.poll();
                if(node != null){
                    rightSide = node;
                    q.add(node.left);
                    q.add(node.right);
                }
            }
            
            if(rightSide != null){
                result.add(rightSide.val);
            }
        }

        return result;
    }
}
