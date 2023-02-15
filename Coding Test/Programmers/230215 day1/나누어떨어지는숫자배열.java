package day1;

//문제 설명
//array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
//divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
//
//제한사항
//arr은 자연수를 담은 배열입니다.
//정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
//divisor는 자연수입니다.
//array는 길이 1 이상인 배열입니다.


import java.util.Arrays;

public class 나누어떨어지는숫자배열 {
    public static void main(String[] args) {
        int[] arr = {3,5,6,18,20};
        int divisor = 3;

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0){
                count++;
            }
        }

        int[] answer = new int[count];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0){
                for (int j=0; j<count;j++){
                    if (answer[j] == 0){
                        answer[j] = arr[i];
                        break;
                    }
                }

            }
        }

        Arrays.sort(answer);

    }
}


class Solution14 {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0){
                count++;
            }
        }
        if (count == 0){
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[count];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0){
                for (int j=0; j<count;j++){
                    if (answer[j] == 0){
                        answer[j] = arr[i];
                        break;
                    }
                }

            }
        }

        Arrays.sort(answer);

        return answer;
    }
}

