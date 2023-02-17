package day3;

/* q32
문제 설명
정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를
배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.

제한사항
numbers의 길이는 2 이상 100 이하입니다.
numbers의 모든 수는 0 이상 100 이하입니다.
 */


import java.util.*;

public class 챌_두개뽑아서더하기 {
    public static int[] solution(int[] numbers) {
        Set<Integer> set1 = new HashSet<Integer>();
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                set1.add(numbers[i] + numbers[j]);
            }
        }

//        int[] answer = set1.toArray(new int[0]);      // set을 배열로 변환이 안된다!! int와 Interger차이?

        int[] answer = new int[set1.size()];

        for (int x : set1) {
            arrList.add(x);
        }
        Collections.sort(arrList);
        int count = 0;
        for (int y : arrList) {
            answer[count] = y;
            count++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};
        System.out.println(solution(numbers));
    }
}
