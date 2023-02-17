package day3;

/* Q34
문제 설명
수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다.
수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때,
가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

제한 조건
시험은 최대 10,000 문제로 구성되어있습니다.
문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
 */


import java.util.ArrayList;
import java.util.Arrays;

public class 챌_모의고사 {
    public static int[] solution(int[] answers) {
//       answers = {1,3,2,4,2,5};
        int[] p1 = {1,2,3,4,5};
        int[] p2 = {2,1,2,3,2,4,2,5};
        int[] p3 = {3,3,1,1,2,2,4,4,5,5};

        int c1 = 0, c2 = 0, c3 = 0;
        int t1 = 0, t2 = 0, t3 = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i]==p1[t1]){
                c1++;
            }
            if (answers[i]==p2[t2]){
                c2++;
            }
            if (answers[i]==p3[t3]){
                c3++;
            }
            t1++;
            t2++;
            t3++;
            if (t1==p1.length){
                t1=0;
            }
            if (t2==p2.length){
                t2=0;
            }
            if (t3==p3.length){
                t3=0;
            }
        }

        if(c1==c2&&c2==c3){
            int[] a = {1,2,3};
            return a;
        } else if(c1==c2&&c2>c3){
            int[] a = {1,2};
            return a;
        } else if (c2==c3&&c2>c1) {
            int[] a = {2,3};
            return a;
        }else if (c1==c3&&c1>c2) {
            int[] a = {1,3};
            return a;
        }else if (c1>c2&&c1>c3) {
            int[] a = {1};
            return a;
        }else if (c2>c1&&c2>c3) {
            int[] a = {2};
            return a;
        }else if (c3>c1&&c3>c2) {
            int[] a = {3};
            return a;
        }
        int[] b = {0};
        return b;


    }

    public static void main(String[] args) {
        int[] answers = {1,3,2,4,2,5};
        System.out.println(solution(answers));
    }
}
