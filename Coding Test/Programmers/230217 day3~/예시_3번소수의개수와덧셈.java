package day3;

/*
## 3번. 소수의 개수와 덧셈 (상)

### **문제 설명**

문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다. str에 나타나는 숫자 중 소수의 최대값과
소수가 아닌 수의 최소값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.

예를들어 s가 "2 3 4 5"라면 "4 5"를 리턴하고, "15 3 10 9 7 8"라면 "8 7"을 리턴하면 됩니다.

### 제한사항

- s에는 둘 이상의 정수가 공백으로 구분되어 있습니다.
- 문자열에는 소수가 한개 이상 섞여 있습니다.
- 문자열에는 소수가 아닌 수가 한개 이상 섞여 있습니다.
- 음수는 없습니다.
 */

import java.util.ArrayList;

public class 예시_3번소수의개수와덧셈 {
    public String solution(String s) {
        String[] str = s.split(" ");
        int[] p = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            p[i] = Integer.parseInt(str[i]);
        }
        
        int min = 100;
        int max = 0;
        for (int i = 0; i < p.length; i++) {
            for (int j = 2; j < p[i]; j++) {
                if ((p[i]%j==0) && (p[i]<min)){     //소수가 아닌수 최소값
                    min = p[i];
                }
            }
        }
        int count = 0;
        for (int i = 0; i < p.length; i++) {    //소수판별
            count = 0;
            for (int j = 2; j < p[i]; j++) {
                if(p[i]%j==0){                  //소수가 아니면 바로 i 넘김
                    break;
                }
                if (p[i]%j!=0){                 //소인수로 안나눠지면 count+1
                    count++;
                }
            }
            if ((count == p[i]-2) && p[i]>max){ //모든 소인수로 안나눠지면 count = 값 -2
                max = p[i];
            }
        }


        String answer = "" + min + " " + max;


        return answer;
    }

    public static void main(String[] args) {
        예시_3번소수의개수와덧셈 method = new 예시_3번소수의개수와덧셈();
        String s = "97 75 88 99 95 92 73";
        System.out.println(method.solution(s));
    }
}
