package leetcode;

public class L19_moveZeroes {
  public void moveZeroes(int[] nums) {
    if (nums==null || nums.length<=1) return;

    int idx = 0;
    for (int i=0; i< nums.length; i++){
      if (nums[idx]!=0)nums[idx++] = nums[i];
    }
    while (idx< nums.length){
      nums[idx++] = 0;
    }

  }

}
