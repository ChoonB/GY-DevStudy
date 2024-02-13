package leetcode;

import java.util.Stack;
import leetcode.L17_reverseLinkedList.ListNode;

public class L18_palindromeLinkedList {
    public static boolean isPalindrome(ListNode head) {
      int n = 0;
      ListNode node = head;
      while (node != null) {
        n++;
        node = node.next;
      }
      if (n <= 1) return true;

      node = head;
      Stack<ListNode> st = new Stack<>();
      for (int i = 1; i <= n / 2; i++) {
        st.push(node);
        node = node.next;
      }

      // 노드의 개수가 홀수일 때, 중간 노드는 비교에서 제외
      if (n % 2 == 1) {
        node = node.next;
      }

      for (int i = n / 2 + 1; i <= n; i++) {
        if (st.isEmpty()) {
          return false;  // 스택이 비어있는데 노드를 pop하려고 할 때
        }
        ListNode tmp = st.pop();
        if (tmp.val != node.val) {
          return false;
        } else {
          node = node.next;
        }
      }
      return true;
    }

  public static void main(String[] args) {
    ListNode a = new ListNode(1);
    a.next = new ListNode(0);
    a.next.next = new ListNode(1);

    System.out.println(isPalindrome(a));
  }


}
