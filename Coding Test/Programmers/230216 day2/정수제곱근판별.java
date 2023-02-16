package day2;

/* Q25
문제 설명
임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면
-1을 리턴하는 함수를 완성하세요.

제한 사항
n은 1이상, 50000000000000 이하인 양의 정수입니다.
 */


public class 정수제곱근판별 {
    public static long solution(long n) {
        long answer = 0;
        long i = 0;
        while (true){
            i++;
            if (n == i*i){
                answer = (i+1)*(i+1);
                break;
            } else if (n<(i*i)) {
                answer = -1;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(121));
    }
}
