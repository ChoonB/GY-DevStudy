package leetcode;

import java.util.HashMap;
import java.util.Map;

public class L14_linkedListCycle {

   public static class ListNode {
       int val;
       ListNode next;
       ListNode(int x) {
           val = x;
           next = null;
       }
   }

   public boolean hasCycle(ListNode head) {
      if (head==null) return false;
      Map<ListNode, Integer> map = new HashMap<>();
      map.put(head, 1);
      ListNode node = head;
      while (true){
         node = node.next;
         if (node == null) return false;
         if (map.containsKey(node)) return true;
         else map.put(node, 1);
      }
   }


}
