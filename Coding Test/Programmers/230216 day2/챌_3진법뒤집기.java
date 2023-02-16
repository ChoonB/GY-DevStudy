package day2;

/*챌린저 Q29
문제 설명
자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후,
이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.

제한사항
n은 1 이상 100,000,000 이하인 자연수입니다.

 */


public class 챌_3진법뒤집기 {
    public static int solution(int n) {
        int answer = 0;
        String a = "";
        a = Integer.toString(n,3);
        char[] chr = new char[a.length()];
        for (int i = a.length()-1, j=0; i >= 0; i--, j++) {
            chr[j] = a.charAt(i);
        }
        String s = new String(chr);
        answer = Integer.parseInt(s,3);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(125));
    }
}
