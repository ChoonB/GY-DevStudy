package leetcode;

import java.util.HashSet;
public class M04_longestConsecutiveSequence {
  public int longestConsecutive(int[] nums) {
    if (nums == null || nums.length == 0)
      return 0;

    HashSet<Integer> set = new HashSet<>();
    for (int num : nums)
      set.add(num);

    int l = 0;

    for (int num : nums) {
      if (!set.contains(num - 1)) {
        int currentNum = num;
        int currentStreak = 1;

        while (set.contains(currentNum + 1)) {
          currentNum++;
          currentStreak++;
        }

        l = Math.max(l, currentStreak);
      }
    }

    return l;
  }

}
