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
     static class Info{
        int dia;
        int ht;

        Info(int dia, int ht){
            this.dia = dia;
            this.ht = ht;
        }
    }

    public static Info optmizedDiameter(TreeNode root){
        if(root == null) return new Info(0, 0);
        Info lInfo = optmizedDiameter(root.left);
        Info rInfo = optmizedDiameter(root.right);
        int finalDia = Math.max(Math.max(lInfo.dia, rInfo.dia), lInfo.ht + rInfo.ht + 1);
        int finalHt = Math.max(lInfo.ht, rInfo.ht) + 1;

        return new Info(finalDia, finalHt);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        return optmizedDiameter(root).dia-1;
    }
}
