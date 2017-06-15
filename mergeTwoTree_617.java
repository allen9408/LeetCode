// https://leetcode.com/problems/merge-two-binary-trees/#/description
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        Treenode newNode = new TreeNode(0);
        if (t1 == null && t2 == null) {
            newNode = null;
        } else if (t1 != null && t2 != null) {
            newNode.val = t1.val + t2.val
        } else {
            newNode.val = (t1 == null)? t2.val : t1.val;
        }
        newNode.left = mergeTrees(t1.left, t2.left);
        newNode.right = mergeTrees(t1.right, t2.right);
    }
}