package day2;
/* Q21
문제 설명
        문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
        각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

        제한 사항
        문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
        첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.


 */


import java.util.Arrays;

public class 이상한문자만들기 {
    public static String solution(String s) {
        String answer = "";
        String[] a = s.split("");

        int num = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(" ")){
                num = 0;
            } else if (num %2 == 0){
                a[i] = a[i].toUpperCase();
                num++;
            } else if (num%2 == 1){
                a[i] = a[i].toLowerCase();
                num++;
            }
            answer += a[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "try    hello world";
        System.out.println(solution(s));

    }
}

/*
        char[] a = s.toCharArray();
        int num = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == ' '){
                num = 0;
                continue;
            }
            if (num %2 == 0){
                a[i] = Character.toUpperCase(a[i]);
            }
            num++;
        }
        String answer = new String(a);
        return answer;
 */
