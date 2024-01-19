package leetcode;

import java.util.ArrayList;
import java.util.List;

public class L08_binaryTreeInorderTraversal {
   public static class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode() {}
       TreeNode(int val) { this.val = val; }
       TreeNode(int val, TreeNode left, TreeNode right) {
           this.val = val;
           this.left = left;
           this.right = right;
       }
   }

   List<Integer> list;

   private void dfs(TreeNode node){
     if (node != null){
       if (node.left != null) dfs(node.left);
       list.add(node.val);
       if (node.right != null) dfs(node.right);
     }
   }

  public List<Integer> inorderTraversal(TreeNode root) {
     list = new ArrayList<>();
     dfs(root);
     return list;
  }

  public static void main(String[] args) {
    L08_binaryTreeInorderTraversal l = new L08_binaryTreeInorderTraversal();
    
  }

}
