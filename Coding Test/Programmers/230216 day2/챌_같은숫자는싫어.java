package day2;

/*챌 Q31
문제 설명
배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다.
이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다.
단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 예를 들면,

arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.

제한사항
배열 arr의 크기 : 1,000,000 이하의 자연수
배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수

 */


import java.util.Arrays;
import java.util.Stack;

public class 챌_같은숫자는싫어 {
    public static int[] solution(int[] arr) {
        Stack<Integer> st = new Stack<Integer>();

        int tmp = arr[0];
        st.push(tmp);
        for (int i = 1; i < arr.length; i++) {
            tmp = arr[i];
            int tmp2 = st.peek();
            if (arr[i] == tmp2){
                continue;
            }
            st.push(tmp);
        }
        int[] answer = new int[st.size()];
        for (int i = st.size()-1; i >=0; i--) {
            answer[i] = st.pop();
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        System.out.println(solution(arr));
    }
}


/*
    String[] str = new String[arr.length]; // String배열 선언

        for (int i = 0; i < arr.length; i++) { // int배열을 String배열로
        str[i] = "" + arr[i];
        }
        String s = "";

        for (int i = 0; i < str.length; i++) {
        if(i>0 && str[i].equals(str[i-1])){ //연속이면 추가 안하게 조건문작성
        continue;
        }
        s += str[i];                        //String s에 연속안된 문자열만 추가
        }
        int[] answer = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {  //String s를 한자씩 charAt -'0'으로 int배열에 삽입.
        answer[i] = s.charAt(i) - '0';
        }

 */