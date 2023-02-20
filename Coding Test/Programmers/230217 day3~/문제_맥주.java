package day3;

/*
맥주를 시키면 1병당 도장 하나. 도장이 10개가 되면 서비스 맥주 1병
바꾼 맥주에도 1병. 주문한 맥주병 수 beer가 주어질때
마실 수 있는 최대 서비스 맥주병 수를 return하는 solution 함수를 작성
beer는 정수
0<=beer<=10000
 */


public class 문제_맥주 {
    public int solution(int beer) {
        int answer = 0;
        while(beer>=10){
            int bonus = 0;
            bonus = beer/10;
            answer += bonus;
            beer = beer%10 + bonus;
        }
        return answer;
    }

    public static void main(String[] args) {
        문제_맥주 result = new 문제_맥주();
        int num1 = 1091;
        System.out.println(result.solution(num1));
    }
}
