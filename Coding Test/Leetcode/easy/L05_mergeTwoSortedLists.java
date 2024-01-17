package leetcode;

public class L05_mergeTwoSortedLists {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      if (list1==null) return list2;
      if (list2==null) return list1;

      ListNode answer = new ListNode();
      ListNode tmp = answer;

      while (list1!=null && list2!=null){
        if (list1.val>list2.val){
          tmp.next = list2;
          list2 = list2.next;
        } else {
          tmp.next = list1;
          list1 = list1.next;
        }
        tmp = tmp.next;
      }
      if (list1==null){
        tmp.next = list2;
      } else {
        tmp.next = list1;
      }
      answer = answer.next;

      return answer;
  }

  public static void main(String[] args) {
  }

}
