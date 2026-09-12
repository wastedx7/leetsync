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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Queue<Integer> preorderQueue = new LinkedList<>();
        for(int val : preorder){
            preorderQueue.offer(val);
        }
        return build(preorderQueue, inorder);
    }
    private TreeNode build(Queue<Integer> preorderQueue, int[] inorder){
        if(inorder.length > 0){
            int idx = indexOf(inorder, preorderQueue.poll());
            TreeNode root = new TreeNode(inorder[idx]);

            root.left = build(preorderQueue, Arrays.copyOfRange(inorder, 0, idx));
            root.right = build(preorderQueue, Arrays.copyOfRange(inorder, idx+1, inorder.length));

            return root;
        }
        return null;
    }
    private int indexOf(int[] arr, int val){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == val)
            return i;
        }
        return -1;
    }
}