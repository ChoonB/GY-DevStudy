package algo;

import java.util.Arrays;
import java.util.Random;

public class A_MergeSort {

//  정렬 과정에서 사용할 임시 배열
  private static int[] tempArray;

  public static void mergeSort(int[] array){
    if (array.length < 2) return;

//    임시배열을 원본 배열의 사이즈로 만든다
    tempArray = new int[array.length];
    mergeSort(array, 0, array.length-1);
//    임시 배열의 용도가 다해서 null 처리한다.
    tempArray = null;

  }

  private static void mergeSort(int[] array, int left, int right){
//    left = right가 넘어가면 부분배열이 1개의 원소만 갖게되므로 종료한다.
    if (left >= right) return;

    int mid = (left + right) / 2;         // 절반위치

    mergeSort(array, left, mid);          // left~mid까지 왼쪽 부분 배열로 분할
    mergeSort(array, mid+1, right); // mid+1~right까지 오른쪽 부분 배열로 분할

    merge(array, left, mid, right);       // 분할된 배열을 병합
  }

  private static void merge(int[] array, int left, int mid, int right){
    int l = left;       // 왼쪽 부분 배열의 시작 인덱스
    int r = mid + 1;    // 오른쪽 부분 배열의 시작 인덱스
    int i = left;       // 임시 배열에 채워넣을 인덱스

//    왼쪽, 오른쪽 부분 배열이 둘다 남아있을때
    while (l <= mid && r <= right){
//      왼쪽이 더 작으면 왼쪽껄 임시 배열에 삽입
      if (array[l] <= array[r]){
        tempArray[i] = array[l];
        i++;
        l++;
//        오른쪽이 더 작으면 오른쪽껄 임시 배열에 삽입
      } else {
        tempArray[i] = array[r];
        i++;
        r++;
      }
    }

//    왼쪽 부분배열이 임시배열에 다 들어갔을 때
    if (l > mid){
//      오른쪽 부분배열이 남아있으면 남은 오른쪽 배열을 임시배열에 삼입
      while (r <= right){
        tempArray[i] = array[r];
        i++;
        r++;
      }
//      오른쪽 부분배열이 임시배열에 다 들어갔을 때
    } else {
//      왼쪽 부분배열이 남아있으면 남은 왼쪽 배열을 임시뱅려에 삽입
      while (l <= mid) {
        tempArray[i] = array[l];
        i++;
        l++;
      }
    }
//   부분배열이 모두 임시배열에 들어가면 원래 배열을 임시배열로 대체
    for (int j = left; j <= right; j++) {
      array[j] = tempArray[j];
    }

  }

  public static void main(String[] args) {
    Random random = new Random();
    int[] array = new int[10];
    for (int i = 0; i < array.length; i++) {
      array[i] = random.nextInt(100); // 0~99까지 정수 랜덤
    }

    System.out.print("정렬 전 배열 : ");
    System.out.println(Arrays.toString(array));
    System.out.println("-----------------------------------------");
    mergeSort(array);
    System.out.print("병합정렬 후 배열 : ");
    System.out.println(Arrays.toString(array));
    System.out.println("-----------------------------------------");

  }

}
