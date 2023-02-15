package day1;
//문제 설명
//어떤 정수들이 있습니다. 이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와
// 이 정수들의 부호를 차례대로 담은 불리언 배열 signs가 매개변수로 주어집니다.
// 실제 정수들의 합을 구하여 return 하도록 solution 함수를 완성해주세요.
//제한사항
//absolutes의 길이는 1 이상 1,000 이하입니다.
//absolutes의 모든 수는 각각 1 이상 1,000 이하입니다.
//signs의 길이는 absolutes의 길이와 같습니다.
//signs[i] 가 참이면 absolutes[i] 의 실제 정수가 양수임을, 그렇지 않으면 음수임을 의미합니다.



public class 음양더하기 {
    public static void main(String[] args) {
        int answer = 0;

        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};
        int s = 1;

        for(int i = 0; i<absolutes.length; i++){
            if (signs[i]==true){
                s = 1;
            } else {
                s = -1;
            }
            answer += (s * absolutes[i]);

        }

    }
}

class Solution7 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int s = 1;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i] == true) {
                s = 1;
            } else {
                s = -1;
            }
            answer += (s * absolutes[i]);
        }
        return answer;
    }
}
