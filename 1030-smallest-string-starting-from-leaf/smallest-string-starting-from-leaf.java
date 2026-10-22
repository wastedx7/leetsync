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
    private String small = null;

    public String smallestFromLeaf(TreeNode root) {
        dfs(root, "");
        return small;
    }
    private void dfs(TreeNode root, String str){
        if(root == null){
            return;
        }

        char c = (char) (root.val + 'a');
        str = c + str;

        if(root.left == null && root.right == null){
            if(small == null || str.compareTo(small) < 0){
                small = str;
            }
            return;
        }

        dfs(root.left, str);
        dfs(root.right, str);
    }
}