package leetcode;

import java.util.HashMap;
import java.util.Map;
import leetcode.L14_linkedListCycle.ListNode;

public class L15_intersectionofTwoLinkedLists {
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    if (headA==null || headB==null) return null;
    if (headA==headB) return headA;
    Map<ListNode, Integer> map = new HashMap<>();
    map.put(headA, 1);
    ListNode nodeA = headA.next;
    while (nodeA!=null){
      map.put(nodeA,1);
      nodeA = nodeA.next;
    }

      ListNode nodeB = headB;
    while (nodeB!=null){
      if (map.containsKey(nodeB)) return nodeB;
      else nodeB = nodeB.next;
    }

    return null;
  }

}
