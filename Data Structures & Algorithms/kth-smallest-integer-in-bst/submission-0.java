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
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> res = new PriorityQueue<>(); 
        Queue<TreeNode> q = new LinkedList<>();

        if(root == null){
            return 0;
        }
        
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            
            for(int i = 0; i < size; i++){
                TreeNode curr = q.poll();
                res.add(curr.val);

                if(curr.left != null){
                    q.offer(curr.left);
                }

                if(curr.right != null){
                    q.offer(curr.right);
                }
            }
        }

        for(int i = 1; i <= k; i++){
            int val = res.poll();
            if(i == k){
                return val;
            }
        }
        return -1;
    }
}
