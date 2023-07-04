package algo;

import java.util.Arrays;

public class A_TailRecursion {

  // 재귀 팩토리얼
  private static int factorial(int n) {
    if (n > 1) {
      return n * factorial(n - 1); // 반환부에 연산이 존재함
    } else {
      return 1; // 정지 조건
    }
  }

  // 꼬리 재귀 팩토리얼
  private static int factorial(int n, int accumulator) {
    if (n > 1) {
      return factorial(n - 1, n * accumulator); // 반환부에 연산이 없음
    } else {
      return accumulator; // 정지 조건
    }
  }

  public static void main(String[] args) {
    int n = 10;

    int factorialResult = factorial(n);

    int accumulator = 1;
    int tailFactorialResult = factorial(n, accumulator);

    System.out.println("factorialResult = " + factorialResult);
    System.out.println("tailFactorialResult = " + tailFactorialResult);


  }


}
