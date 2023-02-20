package day3;

/*
windows에서 지원하는 지뢰 찾기 게임을 한번쯤은 해 보았을 것이다.
특히 르탄이는 지뢰찾기의 매니아로 알려져 있다. 지뢰 찾기 map은 N*N의 정사각형 모양으로
각 칸에는 숫자가 들어가 있거나 지뢰가 들어가 있다. 빈 칸에는 숫자 0이 들어있다고 생각하자.

map의 어떤 칸에 적혀 있는 숫자는, 그 칸과 인접해 있는 여덟 개의 칸 중에서 지뢰가 들어 있는 칸이 몇 개인지를 나타내 준다.
물론 인접한 칸이 map 내부에 있는 경우에 대해서만 생각하면 된다. 예제를 보면 더 잘 이해할 수 있을 것이다.

이번 문제는 조금 업그레이드 된 지뢰 찾기로, 한 칸에 한 개의 지뢰가 있는 것이 아니고, 한 칸에 여러 개(1 이상 9 이하)의
지뢰가 묻혀 있는 게임이다. 따라서 map의 어떤 칸에 적혀 있는 숫자는, 그 칸과 인접해 있는 여덟 개의 칸들에 들어 있는
지뢰의 총 개수가 된다.

이미 windows 지뢰찾기 같은 것을 마스터한 르탄이는, map에서 지뢰에 대한 정보만이 주어졌을 때, 르탄이는 map을 완성하고
싶다고 한다. N과 지뢰의 위치가 주어졌을 때, 르탄이를 도와서 지뢰 찾기 map을 완성하는 프로그램을 작성하시오.

(단, 1 ≤ N ≤ 1,000 이며, 배열의 각 요소에는 지뢰 찾기 map에 대한 정보가 주어지는데 '.' 또는 숫자로 이루어진 문자열이
들어온다. '.'는 지뢰가 없는 것이고 숫자는 지뢰가 있는 경우로 그 칸의 지뢰의 개수이다. 한 줄은 N개의 문자로 이루어져 있다.)
 */

import java.util.Arrays;

public class 시험_지뢰탐지가필요해 {
    public char[][] solution(int N, char[][] ary) {
        int tmp = 0;

        int[][] bomb = new int[N][N];
        for (int i = 0; i < bomb.length; i++) {
            for (int j = 0; j < bomb[0].length; j++) {
                if(ary[i][j] != '.'){
                    bomb[i][j] = ary[i][j] - '0';
                }
            }
        }

        char[][] answer = new char[N][N];

//        1. answer에 숫자 넣기
//        1-1. 모서리부분이 아닐때 8개 더하는 칸
        if(N>2){
            for (int i = 1; i < answer.length-1; i++) {
                for (int j = 1; j < answer[0].length-1; j++) {
                    tmp = 0;
                    tmp = (bomb[i-1][j-1]+bomb[i-1][j]+bomb[i-1][j+1]
                            +bomb[i][j-1]+bomb[i][j+1]
                            +bomb[i+1][j-1]+bomb[i+1][j]+bomb[i+1][j+1]);
                    if(tmp>=10){
                        answer[i][j] = 'M';
                    }else {
                        answer[i][j] = (char)(tmp + '0');
                    }
                }
            }
        }
        tmp = 0;
//        1-2. 구석일때 3개 더하는 칸
        if(N>1){
            tmp = (bomb[0][1] + bomb[1][0] + bomb[1][1]);
            if(tmp>=10){
                answer[0][0] = 'M';
            }else {
                answer[0][0] =(char)(tmp + '0');
            }

            tmp = (bomb[0][N-2] + bomb[1][N-2] + bomb[1][N-1]);
            if(tmp>=10){
                answer[0][N-1] = 'M';
            }else {
                answer[0][N-1] = (char)(tmp + '0');
            }

            tmp = (bomb[N-2][0] + bomb[N-2][1] + bomb[N-1][1]);
            if(tmp>=10){
                answer[N-1][0] = 'M';
            }else {
                answer[N-1][0] = (char)(tmp + '0');
            }

            tmp = (bomb[N-2][N-1] + bomb[N-2][N-2] + bomb[N-1][N-2]);
            if(tmp>=10){
                answer[N-1][N-1] = 'M';
            }else {
                answer[N-1][N-1] = (char)(tmp + '0');
            }
        }
        tmp = 0;
//        1-3. 사이드일때 5개 더하는 칸
        if(N>2){
            for (int i = 1; i < answer.length-1; i++) {
                tmp = (bomb[0][i-1]+bomb[0][i+1]
                        +bomb[1][i-1]+bomb[1][i]+bomb[1][i+1]);
                if(tmp>=10){
                    answer[0][i] = 'M';
                }else {
                    answer[0][i] = (char)(tmp + '0');
                }
            }

            tmp = 0;
            for (int i = 1; i < answer.length-1; i++) {
                tmp = (char) (bomb[i - 1][0] + bomb[i - 1][1]
                        + bomb[i][1] + bomb[i + 1][1] + bomb[i + 1][0]);
                if(tmp>=10){
                    answer[i][0] = 'M';
                }else {
                    answer[i][0] = (char)(tmp + '0');
                }
            }

            tmp = 0;
            for (int i = 1; i < answer.length-1; i++) {
                tmp = (char) (bomb[N-1][i-1] + bomb[N-2][i-1]
                        + bomb[N-2][i] + bomb[N-2][i+1] + bomb[N-1][i+1]);
                if(tmp>=10){
                    answer[N-1][i] = 'M';
                }else {
                    answer[N-1][i] = (char)(tmp + '0');
                }
            }

            tmp = 0;
            for (int i = 1; i < answer.length-1; i++) {
                tmp = (char) (bomb[i-1][N-1] + bomb[i-1][N-2]
                        + bomb[i][N-2] + bomb[i+1][N-2] + bomb[i+1][N-1]);
                if(tmp>=10){
                    answer[i][N-1] = 'M';
                }else {
                    answer[i][N-1] = (char)(tmp + '0');
                }
            }
        }
        // 2. answer에 지뢰넣기
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[0].length; j++) {
                if (ary[i][j] != '.'){
                    answer[i][j] = '*';
                }
            }
        }
        // 3. N이 1이고 지뢰가 아닐때
        if(N==1 && ary[0][0] == '.'){
            answer[0][0] = '*';
        }
        return answer;
    }

    public static void main(String[] args) {
        시험_지뢰탐지가필요해 method = new 시험_지뢰탐지가필요해();
        int N = 2;
        char[][] chars = {
                {'2', '.'},
                {'.', '.'},
                };
        System.out.println(Arrays.deepToString(method.solution(N, chars)));
    }
}