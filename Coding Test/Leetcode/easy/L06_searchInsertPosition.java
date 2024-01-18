package leetcode;

public class L06_searchInsertPosition {

  public int searchInsert(int[] nums, int target) {
    int l = 0;
    int r = nums.length-1;
    int mid = 0;
    if (r==1) return 0;

    while (l<=r){
      mid = l+ (r-l)/2;
      if (nums[mid]==target){
        return mid;
      } else if (nums[mid]>target){
        r = mid-1;
      } else {
        l = mid +1;
      }
    }

    if (nums[mid]>target) return mid;
    else return mid+1;
  }

  public static void main(String[] args) {

  }

}
