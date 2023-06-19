package algo;

import java.util.Arrays;

public class A_InsertionSort {

  private static void insertionSort(int[] array){
//    두번째 값부터 비교를 시작해서 i=1 부터 시작
    for (int i = 1; i < array.length; i++) {
      int key = array[i];
      int j = i-1;
//      key값이 이전 원소들보다 작을때까지만 반복
      while (j >= 0 && array[j] > key){
//        원소를 한칸씩 뒤로 미룸
        array[j+1] = array[j];
        j--;
      }
//      정렬 위치에 맞게 key값을 삽입
      array[j+1] = key;
    }
  }

  private static void binaryInsertionSort(int[] array){
    for (int i = 1; i < array.length; i++) {
      int key = array[i];
//      이진탐색으로 앞의 배열 탐색. 최종 위치는 low가 된다.
      int low = 0;
      int high = i-1;
      while(low <= high){
        int mid = (low+high)/2;
        if (key < array[mid]){
          high = mid - 1;
        } else {
          low = mid + 1;
        }
      }
//      i-1부터 최종 위치까지 원소를 한칸 씩 뒤로 민다
      for (int j = i-1; j >= low; j--){
        array[j+1] = array[j];
      }
//      최종 위치에 key값을 삽입
      array[low] = key;
    }
  }

  public static void main(String[] args) {
    int[] array = {1,2,7,5,4,3,9,6,8,10};
    int[] array2 = Arrays.copyOf(array, array.length);
    System.out.print("정렬 전 배열 : ");
    System.out.println(Arrays.toString(array));
    System.out.println("-----------------------------------------");
    insertionSort(array);
    System.out.print("삽입정렬 후 배열 : ");
    System.out.println(Arrays.toString(array));
    System.out.println("-----------------------------------------");
    binaryInsertionSort(array2);
    System.out.print("이진 삽입정렬 후 배열 : ");
    System.out.println(Arrays.toString(array2));
  }


}
