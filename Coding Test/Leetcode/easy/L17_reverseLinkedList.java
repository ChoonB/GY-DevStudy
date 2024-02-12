package leetcode;



public class L17_reverseLinkedList {

   public static class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }


  public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode current = head;
    ListNode next = null;
    while (current != null){
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    return prev;

  }
}
