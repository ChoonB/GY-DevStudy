package leetcode;

import java.util.List;
import java.util.ArrayList;
public class L11_pascalsTriangle {
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> one = new ArrayList<>();
    List<Integer> two = new ArrayList<>();
    one.add(1);
    two.add(1);
    two.add(1);

    list.add(one);
    if (numRows==1) return list;
    list.add(two);
    if (numRows==2) return list;
    for (int i=3; i<=numRows; i++){
      List<Integer> subList = list.get(i-2);
      List<Integer> newList = new ArrayList<>();
      newList.add(subList.get(0));
      for (int j=1; j<subList.size(); j++){
        int sum = subList.get(j-1) + subList.get(j);
        newList.add(sum);
      }
      newList.add(subList.get(subList.size()-1));
      list.add(newList);
    }
    return list;
  }

  public static void main(String[] args) {
    
  }

}
