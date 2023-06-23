package test;

/*
팰린드롬 문제
n이상 m이하 정수에서
거꾸로 뒤집어도 같은 수가 되는 팰린드롬을 만족하는 숫자의 개수를 출력하라
 */

public class T_Palindrome {

  public int solution(int n, int m) {
    int answer = 0;
    for (int i = n; i <= m; i++) {
      if (isPalindrome(i)) {
        answer++;
      }
    }
    return answer;
  }

  private boolean isPalindrome(int i) {
    String s = String.valueOf(i);
    int left = 0;
    int right = s.length() - 1;
    while (left < right) {
      if (s.charAt(left) != s.charAt(right)) {
        return false;
      }
      left++;
      right--;
    }
    return true;
  }


  public static void main(String[] args) {
    T_Palindrome t = new T_Palindrome();
    int n = 1;
    int m = 100;
    System.out.println(t.solution(n, m));
  }

}
