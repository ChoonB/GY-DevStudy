package leetcode;

import java.util.ArrayList;
import java.util.List;

public class L21_sequentialDigits {

  public List<Integer> sequentialDigits(int low, int high) {
      List<Integer> answer = new ArrayList<>();
      String num = "123456789";
      for (int length=2; length<=9; length++){
        for (int start=0; start<=9-length; start++){
          String substring = num.substring(start, start+length);
          int n = Integer.parseInt(substring);

          if (n>=low && n<=high){
            answer.add(n);
          }

        }
      }
      return answer;

  }

}
