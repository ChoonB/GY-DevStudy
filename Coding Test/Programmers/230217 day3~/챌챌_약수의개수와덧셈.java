package day3;

/*
문제 설명
두 정수 left와 right가 매개변수로 주어집니다. left부터 right까지의 모든 수들 중에서,
약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ left ≤ right ≤ 1,000
 */


public class 챌챌_약수의개수와덧셈 {
    public int solution(int left, int right) {
        int answer = 0;

        int count = 0;
        for (int i = left; i <= right; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if(i%j == 0){
                    count++;
                }
            }
            if (count %2 == 0){
                answer += i;
            }else {
                answer -= i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int left = 24;
        int right = 27;
        챌챌_약수의개수와덧셈 result = new 챌챌_약수의개수와덧셈();
        System.out.println(result.solution(left,right));

    }

}
