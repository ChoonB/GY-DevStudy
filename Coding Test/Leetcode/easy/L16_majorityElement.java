package leetcode;

import java.util.Arrays;

public class L16_majorityElement {
  public int majorityElement(int[] nums) {
    int len = nums.length;
    if (len==1) return nums[0];
    Arrays.sort(nums);
    int ans = 0;
    int c = 0;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i]==nums[i-1]){
        ans = nums[i];
        c++;
        if (c>=len/2) return ans;
      } else {
        c = 0;
        ans = nums[i];
      }

    }
    return -1;

  }

}
