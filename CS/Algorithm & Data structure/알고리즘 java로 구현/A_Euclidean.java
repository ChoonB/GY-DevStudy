package p1;

import java.util.Scanner;

public class A_Euclidean {

  // 반복문
  public static int gcdLoop(int a, int b){
    while (b != 0){
      int tmp = b;
      b = a%b;
      a = tmp;
    }
    return a;
  }

  // 재귀
  public static int gcdRecursion(int a, int b){
    if (b==0) return a;
    return gcdRecursion(b,a%b);
  }

  public static int lcm(int a, int b){
    return a * b / gcdLoop(a,b);
  }

  public static void main(String[] args) {
    System.out.println("최대 공약수와 최소공배수를 구할 두 정수를 입력해주세요.");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    if(a<1 || b<1) throw new RuntimeException("양의 정수를 입력하세요.");

    // a<b면 스왑.
    if(a<b) {
      int tmp = a;
      a = b;
      b = tmp;
    }


    int answer1 = gcdLoop(a,b);
    int answer2 = gcdRecursion(a,b);
    int answer3 = lcm(a,b);

    System.out.println("반복문으로 구한 두 수의 최대 공약수는 " + answer1);
    System.out.println("재귀로 구한 두 수의 최대 공약수는 " + answer2);
    System.out.println("두 수의 최소 공배수는 " + answer3);


  }

}
