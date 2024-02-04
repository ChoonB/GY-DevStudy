package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class L13_singleNumber {

  public int singleNumber(int[] nums) {
    Arrays.sort(nums);
    for (int i = 0; i < nums.length-1; i+=2) {
      if (nums[i]!=nums[i+1]) return nums[i];
    }
    return nums[nums.length-1];
  }

  public int singleNumber2(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i],map.getOrDefault(nums[i],0)+1);
    }
    for (int num : nums) {
      if (map.get(num) == 1) return num;
    }
    return 0;
  }

  public int singleNumber3(int[] nums) {
    int result = 0;
    for (int num : nums) {
      result ^= num;
    }
    return result;
  }


}
