package day3;

/* Q36
문제 설명
문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

제한 사항
str은 길이 1 이상인 문자열입니다.
 */


import java.util.ArrayList;
import java.util.Collections;

public class 챌_문자열내림차순으로배치하기 {
    public static String solution(String s) {
        String answer = "";
        char[] spl = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            spl[i] = s.charAt(i);
        }

        ArrayList mini = new ArrayList<>();
        ArrayList max = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < spl.length; i++) {
            if (Character.isLowerCase(spl[i])){
                mini.add(spl[i]);
                count++;
            }else {
                max.add(spl[i]);
            }
        }
        Collections.sort(mini, Collections.reverseOrder());
        Collections.sort(max, Collections.reverseOrder());

        for (int i = 0; i < mini.size(); i++) {
            answer += String.valueOf(mini.get(i));
        }
        for (int i = 0; i < max.size(); i++) {
            answer += String.valueOf(max.get(i));
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "Zbcdefg";
        System.out.println(solution(s));

    }
}
