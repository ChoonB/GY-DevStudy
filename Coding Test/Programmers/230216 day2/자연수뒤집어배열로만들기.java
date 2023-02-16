package day2;

/* Q23
문제 설명
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

제한 조건
n은 10,000,000,000이하인 자연수입니다.
 */


import java.util.Arrays;

public class 자연수뒤집어배열로만들기 {
    public static int[] solution(long n) {
        String s = "" + n;
        
        String[] str = s.split("");

        int[] answer = new int[str.length];

        for (int i = str.length-1, j = 0; i >= 0 ; i--, j++) {
            answer[j] = Integer.parseInt(str[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(12345));
    }
}
