package leetcode;

public class L07_climbingStairs {

  public int climbStairs(int n) {
    if (n==1) return 1;
    int[] dp = new int[n+1];
    dp[1] = 1;
    dp[2] = 2;

    for (int i=3; i<=n; i++){
      dp[i] = dp[i-1] + dp[i-2];
    }
    return dp[n];

  }

  public static void main(String[] args) {
    L07_climbingStairs l = new L07_climbingStairs();
    int n1 = 5;
    System.out.println(l.climbStairs(n1));
  }

}
