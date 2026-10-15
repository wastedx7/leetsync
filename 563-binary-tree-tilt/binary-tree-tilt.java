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
    private int ans = 0;

    public int findTilt(TreeNode root) {
        solve(root);
        return ans;
    }
    private int solve(TreeNode node){
        if(node == null){
            return 0;
        }

        int left = solve(node.left);
        int right = solve(node.right);

        ans += Math.abs(left - right);

        return node.val + left + right;
    }
}