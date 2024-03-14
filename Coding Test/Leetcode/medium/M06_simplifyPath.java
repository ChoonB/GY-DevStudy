package leetcode;

import java.util.*;
public class M06_simplifyPath {
  public String simplifyPath(String path) {
    Deque<String> stack = new ArrayDeque<>();
    Set<String> skip = new HashSet<>(Arrays.asList("..", ".", ""));

    for (String d : path.split("/")) {
      if (d.equals("..") && !stack.isEmpty()) {
        stack.pop();
      } else if (!skip.contains(d)) {
        stack.push(d);
      }
    }

    StringBuilder result = new StringBuilder();
    for (String d : stack) {
      result.insert(0, "/" + d);
    }

    return result.isEmpty() ? "/" : result.toString();
  }
}
