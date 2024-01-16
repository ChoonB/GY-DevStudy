package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class L04_validParentheses {
  public boolean isValid(String s) {
    Deque<Character> st = new ArrayDeque<>();
    for (int i=0; i<s.length(); i++){
      char c = s.charAt(i);
      if (c=='('||c=='['||c=='{'){
        st.push(c);
      } else {
        if(st.isEmpty()) return false;
        char prev = st.poll();

        if (prev=='('&&c==')') continue;
        if (prev=='['&&c==']') continue;
        if (prev=='{'&&c=='}') continue;
        return false;
      }
    }
    return st.isEmpty();
  }

  public static void main(String[] args) {
    L04_validParentheses l = new L04_validParentheses();
    String s1 = "()";
    String s2 = "({[}])";
    System.out.println(l.isValid(s1));
    System.out.println(l.isValid(s2));
  }

}
