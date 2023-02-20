package day3;

/*
르탄이가 1000원을 가지고 편의점에서 물건을 사려고 한다. 편의점에는 500원, 100원, 50원, 10원이 충분히 있고,
편의점 직원은 언제나 거스름돈 개수가 가장 적게 잔돈을 준다. 르탄이가 편의점에서 물건을 사고 1000원 지폐 한 장을 냈을 때,
받을 잔돈의 개수를 구하는 프로그램을 작성하여라. (단, 물건의 가격은 10원 이상 1000원 미만이며, 1원 단위는 고려하지 않는다.)
 */

public class 시험_물건을구매해볼까 {
    public int solution(int num) {
        int answer = 0;

        int change = 1000 - num;

//        1. 500원짜리 계산
        if (change>=500){
            answer += 1;
            change -= 500;
        }
//        2. 100원짜리 계산
        while (change >= 100){
            answer += 1;
            change -= 100;
        }
//        3. 50원계산
        if(change>=50){
            answer += 1;
            change -= 50;
        }
//        4. 10원계산
        while (change>=10){
            answer += 1;
            change -= 10;
        }

        return answer;
    }

    public static void main(String[] args) {
        시험_물건을구매해볼까 method = new 시험_물건을구매해볼까();
        int num1 = 320;
        System.out.println(method.solution(num1));
    }
}