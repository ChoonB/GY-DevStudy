package test;

/*
int 배열 nums가 주어질 때, nums의 서로 다른 3개의 수를 더해
소수가 되는 경우의 수를 모두 구하라
 */

public class T_3개더해소수경우 {

  public int solution(int[] nums){
    int answer = 0;
    for (int i = 0; i<nums.length-2; i++){
      for (int j = i+1; j<nums.length-1; j++){
        for(int k = j+1; k<nums.length; k++){
          int sum = nums[i] + nums[j] + nums[k];
          if (isPrime(sum)) answer++;
        }
      }
    }
    return answer;
  }

  private boolean isPrime(int sum){
    for (int i = 2; i<= Math.sqrt(sum); i++){
      if (sum % i == 0){
        return false;
      }
    }
    return true;
  }


  public static void main(String[] args) {
    T_3개더해소수경우 t = new T_3개더해소수경우();
    int[] nums = {1,2,4,5,6,8};
    System.out.println(t.solution(nums));
  }

}
