package day1;
//문제 설명
//두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
//예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
//
//제한 조건
//a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
//a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
//a와 b의 대소관계는 정해져있지 않습니다.

import java.util.Arrays;

public class 두정수사이의합 {
    public static void main(String[] args) {
        int a = -100;
        int b = -130;
        long answer = 0;
        int c = 0;
        int d= 0;

        if (a>b){
            c = a;
            d = b;
        } else if(a<b) {
            c = b;
            d = a;
        } else {
            System.out.println("같네");
//            return answer;
        }

        for(int i = d; i < (c+1); i++){
            answer += i;
            System.out.println(i);
        }
        System.out.println("answer = " + answer);
    }
}


class Solution4 {
    public long solution(int a, int b) {
        long answer = 0;
        int c = 0;
        int d= 0;

        if (a>b){
            c = a;
            d = b;
        } else if(a<b) {
            c = b;
            d = a;
        } else {
            answer = a;
            return answer;
        }

        for(int i = d; i < (c+1); i++){
            answer += i;
        }
        return answer;
    }
}
