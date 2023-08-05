package p1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A_Eratos {
  static boolean[] primeList;
  static List<Integer> primes;

  private static void eratos(int n){
    if (n<=1) return;

    // 0~n까지 인덱스를 가진 boolean 배열 생성
    primeList = new boolean[n+1];

    // 0,1은 소수가 아니므로 false
    primeList[0] = false;
    primeList[1] = false;
    // 2~n까지는 일단 true로 초기화
    for (int i=2; i<=n; i++){
      primeList[i] = true;
    }

    for (int i=2; (i*i)<=n; i++){
      if (primeList[i]){
        for (int j= i*i; j<=n; j+=i) primeList[j] = false;
      }
    }

    primes = new ArrayList<>();

    for (int i=0; i<=n; i++){
      if (primeList[i]) primes.add(i);
    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    eratos(n);

    System.out.println(primes.toString());

  }

}
