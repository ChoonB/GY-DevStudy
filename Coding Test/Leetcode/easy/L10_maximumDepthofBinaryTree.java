package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.Queue;

public class L10_maximumDepthofBinaryTree {

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

   public static class DepthNode{
     TreeNode node;
     int depth;
     DepthNode(TreeNode node, int depth){
       this.node = node;
       this.depth = depth;
     }
   }

   private int bfs(TreeNode node){
     int d = 1;
     int answer = 1;
     Queue<DepthNode> q = new ArrayDeque<>();
     q.add(new DepthNode(node,d));
     while (!q.isEmpty()){
       DepthNode dn = q.poll();
       if (dn.node.left!=null) {
         DepthNode ldn = new DepthNode(dn.node.left, dn.depth+1);
         q.add(ldn);
         answer = Math.max(answer, ldn.depth);
       }
       if (dn.node.right!=null) {
         DepthNode rdn = new DepthNode(dn.node.right, dn.depth+1);
         q.add(rdn);
         answer = Math.max(answer, rdn.depth);
       }
     }
     return answer;
   }

  public int maxDepth(TreeNode root) {
     if (root==null) return 0;
     return bfs(root);
  }

  public int maxDepth2(TreeNode root){
     if (root==null) return 0;
     return Math.max(maxDepth2(root.left),maxDepth2(root.right))+1;
  }

  public static void main(String[] args) {

  }


}
