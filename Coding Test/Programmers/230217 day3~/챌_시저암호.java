package day3;

/* Q39
문제 설명
어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다. 예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다. 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.

제한 조건
공백은 아무리 밀어도 공백입니다.
s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
s의 길이는 8000이하입니다.
n은 1 이상, 25이하인 자연수입니다.
 */


public class 챌_시저암호 {
    public String solution(String s, int n) {
        char[] a = new char[s.length()];
//        char[] small = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
//        char[] big = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i)>=97 && s.charAt(i)<=122)){
                if(s.charAt(i)+n>122){
                    a[i] = (char)(s.charAt(i)+n-26);
                }else {
                    a[i] = (char)(s.charAt(i)+n);
                }
            }
            if ((s.charAt(i)>=65 && s.charAt(i)<=90)) {
                if (s.charAt(i) + n > 90) {
                    a[i] = (char) (s.charAt(i)+n-26);
                } else {
                    a[i] = (char) (s.charAt(i)+n);
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            if(a[i] == '\u0000'){
                a[i] = ' ';
            }
        }

        System.out.println(a);
        String answer = new String(a);

        return answer;
    }

    public static void main(String[] args) {
        String s = "a B z";
        int n = 4;
        챌_시저암호 result = new 챌_시저암호();
        System.out.println(result.solution(s,n));
    }
}

