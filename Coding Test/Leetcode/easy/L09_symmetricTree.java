package leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

public class L09_symmetricTree {

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

  public boolean isSymmetric(TreeNode root) {
    Queue<TreeNode> qr = new ArrayDeque<>();
    Queue<TreeNode> ql = new ArrayDeque<>();

    if (root.right==null&&root.left==null) return true;

    if ((root.right!=null&&root.left==null)||(root.right==null&&root.left!=null)) return false;

    TreeNode rn = root.right;
    TreeNode ln = root.left;

    if (rn.val!=ln.val) return false;

    qr.add(rn);
    ql.add(ln);

    while (!qr.isEmpty() || !ql.isEmpty()){
      ln = ql.poll();
      rn = qr.poll();

      if ((ln.left==null&&rn.right!=null)||(ln.left!=null&&rn.right==null)
          ||(ln.right==null&&rn.left!=null)||(ln.right!=null&&rn.left==null)){
        return false;
      }

      if (ln.left!=null&&rn.right!=null){
        if (ln.left.val != rn.right.val) return false;
        ql.add(ln.left);
        qr.add(rn.right);
      }

      if (ln.right!=null&& rn.left!=null){
        if (ln.right.val != rn.left.val) return false;
        ql.add(ln.right);
        qr.add(rn.left);
      }
    }
    return true;


  }

  public static void main(String[] args) {
    
  }

}
