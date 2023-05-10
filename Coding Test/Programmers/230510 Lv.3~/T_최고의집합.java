package level3;

/*
최고의 집합
https://school.programmers.co.kr/learn/courses/30/lessons/12938
문제 설명
자연수 n 개로 이루어진 중복 집합(multi set, 편의상 이후에는 "집합"으로 통칭) 중에 다음 두 조건을 만족하는 집합을 최고의 집합이라고 합니다.

각 원소의 합이 S가 되는 수의 집합
위 조건을 만족하면서 각 원소의 곱 이 최대가 되는 집합
예를 들어서 자연수 2개로 이루어진 집합 중 합이 9가 되는 집합은 다음과 같이 4개가 있습니다.
{ 1, 8 }, { 2, 7 }, { 3, 6 }, { 4, 5 }
그중 각 원소의 곱이 최대인 { 4, 5 }가 최고의 집합입니다.

집합의 원소의 개수 n과 모든 원소들의 합 s가 매개변수로 주어질 때, 최고의 집합을 return 하는 solution 함수를 완성해주세요.

제한사항
최고의 집합은 오름차순으로 정렬된 1차원 배열(list, vector) 로 return 해주세요.
만약 최고의 집합이 존재하지 않는 경우에 크기가 1인 1차원 배열(list, vector) 에 -1 을 채워서 return 해주세요.
자연수의 개수 n은 1 이상 10,000 이하의 자연수입니다.
모든 원소들의 합 s는 1 이상, 100,000,000 이하의 자연수입니다.
 */

public class T_최고의집합 {
  public int[] solution(int n, int s) {
    if (n>s) return new int[] {-1};
    int[] result = new int[n];
    int b = 0;

    for (int i = n; i >= 1; i--) {
      int a = s/i;
      s -= a;
      result[b] = a;
      b++;
    }
    return result;
  }

  public static void main(String[] args) {
    T_최고의집합 t = new T_최고의집합();
    int n = 2;
    int s = 1;
    System.out.println(t.solution(n,s));
  }

}
