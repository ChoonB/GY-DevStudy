package day1;
//단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
//
//재한사항
//s는 길이가 1 이상, 100이하인 스트링입니다.
public class 가운데글자가져오기 {
    public static void main(String[] args) {
        System.out.println("230215 3번째 문제!");
        String s = "qwer";
        String answer = "";
        int a = s.length()/2;
        System.out.println(a);
        if (s.length()%2==0){
            answer = s.substring(a-1,a+1);
        } else {
            answer = s.substring(a,a+1);
        }
        System.out.println(answer);
    }
}


class Solution3 {
    public String solution(String s) {
        String answer = "";
        if (s.length()%2==1){//홀수
            answer = s.substring(s.length()/2,s.length()/2+1);
        } else {
            answer = s.substring(s.length()/2-1,s.length()/2+1);
        }
        System.out.println(answer);
        return answer;
    }
}