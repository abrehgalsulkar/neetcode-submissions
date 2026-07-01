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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null) {
            return false;
        }
        if(isSameTree(root, subRoot)) {
            return true;
        } else {
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }
    }

    public boolean isSameTree (TreeNode r, TreeNode subR) {
        if(r == null && subR == null) {
            return true;
        } else if (r == null || subR== null) {
            return false;
        }

        if(r.val != subR.val) {
            return false;
        }
        return isSameTree(r.left, subR.left) && isSameTree(r.right, subR.right);
    }
}