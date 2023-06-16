package algo;

import java.util.Arrays;

public class A_BubbleSort {

  private static void bubbleSort(int[] array){
    int count = 0;
//    i는 회차를 의미한다. n개가 있으면 n-1회차를 수행하기 때문에 array.length -1을 한다.
    for (int i = 0; i < array.length -1; i++) {
//      j는 j+1값과 비교해 정렬되지 않은 값들을 계속 비교한다.
      for (int j = 0; j < array.length-1-i; j++){
        count++;
//        오름차순 기준 앞의 값이 뒷값보다 크면 자리를 swap한다.
        if (array[j]>array[j+1]) {
          int tmp = array[j];
          array[j] = array[j+1];
          array[j+1] = tmp;
        }
      }
    }
    System.out.println("버블 정렬에서 연산 횟수 : " + count);
  }

  private static void improvedBubbleSort(int[] array){
    int count = 0;
    boolean isSwapped;
    for (int i = 0; i < array.length -1; i++) {
      isSwapped = false;
      for (int j = 0; j < array.length-1-i; j++){
        count++;
        if (array[j]>array[j+1]) {
          int tmp = array[j];
          array[j] = array[j+1];
          array[j+1] = tmp;
          isSwapped = true;
        }
      }
//      swap된적이 없다면 정렬이 완료된 것으로 판단해 정렬을 종료한다.
      if (!isSwapped) break;
    }
    System.out.println("개선된 버블 정렬에서 연산 횟수 : " + count);
  }

  public static void main(String[] args) {
    int[] array = {1,2,7,5,4,3,9,6,8,10};
    int[] array2 = Arrays.copyOf(array, array.length);
    System.out.print("정렬 전 배열 : ");
    System.out.println(Arrays.toString(array));
    System.out.println("-----------------------------------------");
    bubbleSort(array);
    System.out.print("버블정렬 후 배열 : ");
    System.out.println(Arrays.toString(array));
    System.out.println("-----------------------------------------");
    improvedBubbleSort(array2);
    System.out.print("개선된 버블정렬 후 배열 : ");
    System.out.println(Arrays.toString(array2));
  }
}
