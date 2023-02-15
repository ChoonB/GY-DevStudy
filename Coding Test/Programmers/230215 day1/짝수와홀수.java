package day1;

//정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
//num은 int 범위의 정수입니다.
//        0은 짝수입니다.
public class 짝수와홀수 {
    public static void main(String[] args) {
        System.out.println("230215 2번째 문제!");
    }
}

class Solution2 {
    public String solution(int num) {
        String answer = "";
        if (num % 2 == 0){
            answer = "Even";
        } else {
            answer = "Odd";
        }
        return answer;
    }
}