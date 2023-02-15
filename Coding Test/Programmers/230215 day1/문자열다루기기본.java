package day1;

//문제 설명 Q17
//문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수,
// solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고
// "1234"라면 True를 리턴하면 됩니다.
//
//제한 사항
//s는 길이 1 이상, 길이 8 이하인 문자열입니다.
//s는 영문 알파벳 대소문자 또는 0부터 9까지 숫자로 이루어져 있습니다.



public class 문자열다루기기본 {
    public static Boolean solution(String s) {
        boolean answer = true;

        if (s.length() != 4 && s.length() != 6){
            answer = false;
            return answer;
        }


        for (int i = 0; i<s.length();i++){
            char a = s.charAt(i);
            if(a<'0' || a>'9'){
                answer = false;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("a1234"));
    }
}