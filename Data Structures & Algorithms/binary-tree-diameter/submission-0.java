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
    int maxDiameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return maxDiameter;
    }

    public int height(TreeNode curr) {
        if (curr == null) {
            return 0;
        }

        int rightHeight = height(curr.right);
        int leftHeight = height(curr.left);

        maxDiameter = Math.max(maxDiameter, leftHeight + rightHeight);

        return 1 + (Math.max(leftHeight, rightHeight));
    }
}