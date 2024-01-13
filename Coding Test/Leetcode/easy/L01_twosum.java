package leetcode;

import java.util.*;
class L01_twosum {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer,Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (map.containsKey(complement)) {
        return new int[]{map.get(complement), i};
      }
      map.put(nums[i], i);
    }
    return null;
  }

  public static void main(String[] args) {
    L01_twosum l = new L01_twosum();
    int[] input1 = new int[]{2,5,5,11};
    int target1 = 10;
    int[] answer1 = l.twoSum(input1,target1);
    System.out.println(Arrays.toString(answer1));
  }

}
