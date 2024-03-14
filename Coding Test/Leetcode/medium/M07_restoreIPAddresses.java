package leetcode;


import java.util.ArrayList;
import java.util.List;

class M07_restoreIPAddresses  {
  public List<String> restoreIpAddresses(String s) {
    List<String> result = new ArrayList<>();
    backtrack(result, s, 0, "", 0);
    return result;
  }

  private void backtrack(List<String> result, String s, int index, String current, int count) {
    if (count > 4) return;
    if (count == 4 && index == s.length()) {
      result.add(current);
      return;
    }

    for (int i = 1; i < 4; i++) {
      if (index + i > s.length()) break;
      String segment = s.substring(index, index + i);
      if ((segment.startsWith("0") && segment.length() > 1) || (i == 3 && Integer.parseInt(segment) >= 256)) continue;
      backtrack(result, s, index + i, current + segment + (count == 3 ? "" : "."), count + 1);
    }
  }
}