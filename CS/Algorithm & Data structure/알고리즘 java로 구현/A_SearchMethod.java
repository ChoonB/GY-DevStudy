package algo;

import java.util.Arrays;

public class A_SearchMethod {

  private static int sequentialSearch(int[] array, int target){
    for (int i = 0; i < array.length; i++) {
      if (array[i] == target){
        return i;
      }
    }
    return -1;
  }

  private static int binarySearch(int[] array, int target){
//    배열의 시작 인덱스를 low, 마지막 인덱스를 high로 설정
    int low = 0;
    int high = array.length-1;
//    값을 찾을 때 까지 while문으로 반복. low가 high와 일치하는 선까지 반복한다.
    while (low <= high){
//      low와 high의 중간값인 mid를 target과 비교
      int mid = (low + high) / 2;
//      일치하면 mid값 반환
      if (array[mid] == target){
        return mid;
//        mid보다 target이 크면 mid 다음값으로 low를 올려서 while문 반복
      } else if (array[mid] < target){
        low = mid + 1;
//        mid보다 target이 작으면 mid 이전값으로 high를 내려서 while문 반복
      } else {
        high = mid - 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] array = {1,2,7,5,4,3,9,6,8,10};
    int target = 8;
    int result = sequentialSearch(array, target);
    if (result == -1){
      System.out.println("순차탐색 결과, 타겟 값이 배열에 없습니다.");
    } else {
      System.out.println("순차탐색 결과, 타겟 값과 일치한 배열의 인덱스는 " + result+ "입니다.");
    }

//    이진탐색을 위한 정렬
    Arrays.sort(array);
    System.out.println("이진탐색을 위해 배열을 정렬합니다.");
    int result2 = binarySearch(array, target);
    if (result2 == -1){
      System.out.println("이진탐색 결과, 타겟 값이 배열에 없습니다.");
    } else {
      System.out.println("이진탐색 결과, 타겟 값과 일치한 배열의 인덱스는 " + result2 + "입니다.");
    }
  }

}
