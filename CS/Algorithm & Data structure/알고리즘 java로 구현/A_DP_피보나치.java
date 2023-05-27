package algo;

public class A_DP_피보나치 {

  private static long[] memo;

  private static long fiboTopDown(int n) {
//    저장된 값이 있으면 반환
    if (memo[n] != 0) return memo[n];
//    0과 1은 미리 값 세팅
    if (n<=1) {
      memo[n] = n;
//      수열을 계산해서 메모이제이션
    } else {
      memo[n] = fiboTopDown(n-1) + fiboTopDown(n-2);
    }
    return memo[n];
  }

  private static long fiboBottomUp(int n) {
    long[] dp = new long[n+1];

    dp[0] = 0;
    dp[1] = 1;

//    바텀업으로 for문으로 아래부터 쌓아서올라감
    for (int i = 2; i<=n; i++) {
      dp[i] = dp[i-1] + dp[i-2];
    }
    return dp[n];

  }

  public static void main(String[] args) {
    int n = 10;
//    배열 초기화
    memo = new long[n+1];
    System.out.println("Topdown 피보나치 " + n + "의 결과는 " + fiboTopDown(n));
    System.out.println("Bottomup 피보나치 " + n + "의 결과는 " + fiboBottomUp(n));
  }

}
