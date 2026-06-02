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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return dfs(p, q);
    }

    public boolean dfs(TreeNode p1, TreeNode q1) {
        boolean left = true;
        boolean right = true;

        if (p1 == null && q1 == null) {
            return true;
        } else if(p1 == null || q1 == null) {
            return false;
        }
        
        if (p1.val == q1.val) {
            left = dfs(p1.left, q1.left);
            right = dfs(p1.right, q1.right);
        } else {
            return false;
        }
        return left && right;
    }
}
