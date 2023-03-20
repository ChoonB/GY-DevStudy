package level2;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/42842
카펫
Leo는 카펫을 사러 갔다가 아래 그림과 같이 중앙에는 노란색으로 칠해져 있고
테두리 1줄은 갈색으로 칠해져 있는 격자 모양 카펫을 봤습니다.
Leo는 집으로 돌아와서 아까 본 카펫의 노란색과 갈색으로 색칠된 격자의 개수는 기억했지만, 전체 카펫의 크기는 기억하지 못했습니다.

Leo가 본 카펫에서 갈색 격자의 수 brown, 노란색 격자의 수 yellow가 매개변수로 주어질 때
카펫의 가로, 세로 크기를 순서대로 배열에 담아 return 하도록 solution 함수를 작성해주세요.

제한사항
갈색 격자의 수 brown은 8 이상 5,000 이하인 자연수입니다.
노란색 격자의 수 yellow는 1 이상 2,000,000 이하인 자연수입니다.
카펫의 가로 길이는 세로 길이와 같거나, 세로 길이보다 깁니다.

 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T_카펫 {
    public int[] solution(int brown, int yellow) {
        int width = 0; // 가로길이 width>= length
        int length = 0; // 세로길이

        int[] a = {1,yellow};
        List<int[]> list = new ArrayList<>();
        list.add(a);


//        필수 조건
//        brown + yellow = width * length
//        brown = width*2 + length*2 - 4
//        yellow = (width-2) * (length-2)
        int r = (brown + yellow)/3;
        for (int i = 2; i <= yellow/2; i++) {
             if (yellow%i == 0){
                 int[] b = {yellow/i, i};
                 list.add(b);
             }
        }
        for (int[] c : list) {
            if (brown+yellow == (c[0]+2) * (c[1]+2)){
                width = c[0]+2;
                length = c[1]+2;
            }
        }

        int[] answer = {width, length};
        return answer;
    }

    public static void main(String[] args) {
        T_카펫 t = new T_카펫();
        int brown = 24;
        int yellow = 24;
        System.out.println(t.solution(brown, yellow));
        System.out.println(Arrays.toString(t.solution(brown, yellow)));
    }
}
