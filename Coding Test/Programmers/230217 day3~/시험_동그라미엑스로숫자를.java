package day3;

/*
"OOXXOXXOOO"와 같은 OX문의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 문제를 맞은 경우 그 문제의 점수는
그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.

"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.

OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.

(단,  OX문의 결과는 0보다 크고 80보다 작은 문자열이 주어진다. 또한 문자열은 O와 X만으로 이루어져 있다.)
 */

public class 시험_동그라미엑스로숫자를 {
    public int solution(String s) {
        int answer = 0;

        char[] schar = s.toCharArray();
        int[] point = new int[s.length()];

        if(schar[0] == 'O'){
            point[0] = 1;
        }
        for (int i = 1; i < schar.length; i++) {
            if (schar[i] == 'O' && schar[i-1] == 'O'){
                point[i] = point[i-1] + 1 ;
            } else if (schar[i] == 'O' && schar[i-1] == 'X') {
                point[i] = 1;
            }
        }
        for (int i = 0; i < point.length; i++) {
            answer += point[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        시험_동그라미엑스로숫자를 method = new 시험_동그라미엑스로숫자를();
        String s = "OXOOOXXXOXOOXOOOOOXO";
        System.out.println(method.solution(s));
    }
}