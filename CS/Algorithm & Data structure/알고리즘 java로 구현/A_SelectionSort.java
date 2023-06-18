package algo;

import java.util.Arrays;

public class A_SelectionSort {

  private static void selectionSort(int[] array){
    int numberCount = 0;
    int swapCount = 0;
    for (int i = 0; i < array.length-1; i++) {
      numberCount++;
      int minIndex = i;
      for (int j = i+1; j < array.length; j++) {
        if (array[j] < array[minIndex]){
          minIndex = j;
        }
        }
      if (minIndex != i){
        int tmp = array[i];
        array[i] = array[minIndex];
        array[minIndex] = tmp;
        swapCount++;
      }
    }
    System.out.println("선택 정렬에서 회차 : " + numberCount);
    System.out.println("선택 정렬에서 교환 횟수 : " + swapCount);
  }

  private static void dualSelectionSort(int[] array){
    int numberCount = 0;
    int swapCount = 0;
    for (int i = 0, j = array.length-1; i<j; i++,j--){
      numberCount++;
      int minIndex = i;
      int maxIndex = j;
//      탐색하면서 min값과 max값 동시에 찾는다.
      for (int k = i+1; k<=j; k++){
        if (array[k]<array[minIndex]){
          minIndex = k;
        } else if (array[k]>array[maxIndex]){
          maxIndex = k;
        }
      }

      if (minIndex != i){
        int tmp = array[i];
        array[i] = array[minIndex];
        array[minIndex] = tmp;
        swapCount++;
//        maxIndex가 i였다면, swap되었기 때문에 위치 재조정
        if (maxIndex == i) maxIndex = minIndex;
      }

      if (maxIndex != j){
        int tmp = array[j];
        array[j] = array[maxIndex];
        array[maxIndex] = tmp;
        swapCount++;
//        minIndex가 j였다면, swap되었기 때문에 위치 재조정
        if (minIndex == j) minIndex = maxIndex;
      }
    }
    System.out.println("이중 선택 정렬에서 회차 : " + numberCount);
    System.out.println("이중 선택 정렬에서 교환 횟수 : " + swapCount);
  }



  public static void main(String[] args) {
    int[] array = {1,2,7,5,4,3,9,6,8,10};
    int[] array2 = Arrays.copyOf(array, array.length);
    System.out.print("정렬 전 배열 : ");
    System.out.println(Arrays.toString(array));
    System.out.println("-----------------------------------------");
    selectionSort(array);
    System.out.print("선택정렬 후 배열 : ");
    System.out.println(Arrays.toString(array));
    System.out.println("-----------------------------------------");
    dualSelectionSort(array2);
    System.out.print("이중 선택정렬 후 배열 : ");
    System.out.println(Arrays.toString(array2));
  }

}
