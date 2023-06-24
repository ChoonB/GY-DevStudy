package test;

/*
직사각형의 세 좌표가 주어질 때, 남은 마지막 좌표를 구하라
 */

import java.util.Arrays;

public class T_사각형남은좌표 {

  public int[] solution(int[][] points){
    int[] answer = new int[2];

    answer[0] = points[0][0] ^ points[1][0] ^ points[2][0];
    answer[1] = points[0][1] ^ points[1][1] ^ points[2][1];


    return answer;
  }

  public static void main(String[] args) {
    T_사각형남은좌표 t = new T_사각형남은좌표();
    int[][] points = {{10,3}, {6,3}, {10,9}};
    System.out.println(Arrays.toString(t.solution(points)));
  }

}
