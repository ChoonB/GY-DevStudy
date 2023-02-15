package day1;
//문제 설명
//대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요. 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
//
//예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.
//
//제한사항
//문자열 s의 길이 : 50 이하의 자연수
//문자열 s는 알파벳으로만 이루어져 있습니다.

public class 문자열내p와y의개수 {
    public static void main(String[] args) {
        String s = "pPoooyY";
        boolean answer = true;

        int countP = 0;
        int countY = 0;

        for (int i = 0; i<s.length();i++){
            switch (s.charAt(i)){
                case 'p':
                    countP++;
                    break;
                case 'P':
                    countP++;
                    break;
                case 'y':
                    countY++;
                    break;
                case 'Y':
                    countY++;
                    break;
                default:
                    break;
            }
        }

        if(countP == 0 && countY == 0){
            System.out.println("answer = " + answer);
        }

        if (countP != countY){
            answer = false;
        }
        System.out.println("answer = " + answer);

    }
}

class Solution16 {
    boolean solution(String s) {
        boolean answer = true;

        int countP = 0;
        int countY = 0;

        for (int i = 0; i<s.length();i++){
            switch (s.charAt(i)){
                case 'p':
                    countP++;
                    break;
                case 'P':
                    countP++;
                    break;
                case 'y':
                    countY++;
                    break;
                case 'Y':
                    countY++;
                    break;
                default:
                    break;
            }
        }

        if(countP == 0 && countY == 0){
            return answer;
        }

        if (countP != countY){
            answer = false;
        }
        return answer;

    }
}
