package leetcode;

import java.util.HashMap;
import java.util.Map;

public class L02_romanToInteger {
  public int romanToInt(String s) {
    Map<Character, Integer> map = new HashMap<>();
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);

    int answer = map.get(s.charAt(0));


    for (int i=1; i<s.length(); i++){
      int cur = map.get(s.charAt(i));
      int prev = map.get(s.charAt(i-1));

      if (cur > prev){
        answer += cur - 2*prev;
      } else {
        answer += cur;
      }
    }
    return answer;

  }

}
