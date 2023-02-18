package day3;

/* Q35
문제 설명
문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를
기준으로 오름차순 정렬하려 합니다. 예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면
각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.

제한 조건
strings는 길이 1 이상, 50이하인 배열입니다.
strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
strings의 원소는 길이 1 이상, 100이하인 문자열입니다.
모든 strings의 원소의 길이는 n보다 큽니다.
인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.
 */


import java.util.Arrays;

public class 챌_문자열내마음대로정렬하기 {
    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings);
        char[] c = new char[strings.length];
        String[] answer = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            c[i] = strings[i].charAt(n);
        }
        Arrays.sort(c);
        int[] jPack = new int[strings.length];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                if (answer[i] != null){
                    break;
                }
                if ((c[i] == strings[j].charAt(n)) && jPack[j] == 0){
                    answer[i] = strings[j];
                    jPack[j] = 1;
                }

            }
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        String[] strings = {"abce", "abcd", "cdx"};
        System.out.println(solution(strings,1));
    }
}
