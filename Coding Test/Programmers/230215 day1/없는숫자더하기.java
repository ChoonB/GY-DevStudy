package day1;
//문제 설명
//0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
//
//제한사항
//1 ≤ numbers의 길이 ≤ 9
//0 ≤ numbers의 모든 원소 ≤ 9
//numbers의 모든 원소는 서로 다릅니다.

import java.util.Objects;

public class 없는숫자더하기 {
    public static void main(String[] args) {
        int[] numbers = {3,4,6,7};
        int sum = 0;
        for(int i = 1; i <= 9; i++){
            for (int j = 0; j<numbers.length; j++){
                if (i == numbers[j]){
                    break;
                }
                if (j == numbers.length -1){
                    sum += i;
                    System.out.println(i);
                }
            }
        }
        System.out.println("sum = " + sum);

    }
}


class Solution6 {
    public int solution(int[] numbers) {
        int answer = -1;
        answer = 0;

        for (int i = 0; i<=9; i++){
            for (int j = 0; j<numbers.length;j++){
                if (i == numbers[j]){
                    break;
                }
                if (j == numbers.length-1){
                    answer += i;
                }
            }
        }
        return answer;
    }
}