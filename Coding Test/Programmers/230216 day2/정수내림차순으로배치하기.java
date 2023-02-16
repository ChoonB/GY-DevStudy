package day2;

/* Q24
문제 설명
함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한
새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.

제한 조건
n은 1이상 8000000000 이하인 자연수입니다.
 */


import java.util.Arrays;

public class 정수내림차순으로배치하기 {
    public static long solution(long n) {
        long answer = 0;
        String s = "" + n;
        String[] str = s.split("");
        Arrays.sort(str);   //str = {1,1,2,3,7,8}
        String[] rev = new String[str.length];
        for (int i= str.length-1, j = 0; j< str.length; i--, j++){
            rev[j] = str[i];
        }   // rev = {8,7,3,2,1,1}
        String p = String.join("",rev);
        answer = Long.parseLong(p);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(118372));
    }
}
