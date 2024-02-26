package leetcode;

public class L20_diameterofBinaryTree {
   public static class TreeNode {

     int val;
     TreeNode left;
     TreeNode right;

     TreeNode() {
     }

     TreeNode(int val) {
       this.val = val;
     }

     TreeNode(int val, TreeNode left, TreeNode right) {
       this.val = val;
       this.left = left;
       this.right = right;
     }
   }

     int diameter;

     public int dfs(TreeNode node) {
       if (node == null)
         return 0;

       int leftDepth = dfs(node.left);
       int rightDepth = dfs(node.right);

       diameter = Math.max(diameter, leftDepth + rightDepth);
       return Math.max(leftDepth, rightDepth) + 1;
     }

     public int diameterOfBinaryTree(TreeNode root) {
       diameter = 0;
       dfs(root);
       return diameter;
     }

}
