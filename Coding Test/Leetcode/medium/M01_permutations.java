package leetcode;

import java.util.ArrayList;
import java.util.List;

public class M01_permutations {
  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    backtrack(result, new ArrayList<>(), nums);
    return result;
  }

  private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums){
    if(tempList.size() == nums.length){
      result.add(new ArrayList<>(tempList));
    } else{
      for(int i = 0; i < nums.length; i++){
        if(tempList.contains(nums[i])) continue; // Skip if element already exists
        tempList.add(nums[i]);
        backtrack(result, tempList, nums);
        tempList.remove(tempList.size() - 1);
      }
    }
  }

}
