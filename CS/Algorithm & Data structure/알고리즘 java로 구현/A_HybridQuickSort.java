package algo.sort;

import java.util.Arrays;
import java.util.Random;

public class A_HybridQuickSort {

  public static void HybridQuickSort(int[] array) {
    int size = array.length;

    if (size < 2) {
      return;
    } else if (size <= 20) {
      System.out.println("size가 20이하기 때문에 삽입정렬을 사용합니다.");
      binaryInsertionSort(array);
    } else {
      System.out.println("size가 20초과이기 때문에 퀵정렬을 사용합니다.");
      MOTQuickSort(array, 0, array.length-1);
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

  private static void MOTQuickSort(int[] array, int low, int high) {
    if (low >= high) return;

    int pivotIndex = findMedianIndex(array, low, high);
    swap(array, pivotIndex, high); // 피벗을 high(맨 오른쪽)으로 이동

    int pivot = partition(array, low, high);

    MOTQuickSort(array, low, pivot-1);
    MOTQuickSort(array, pivot+1, high); // 피벗은 이미 정렬되어있으므로 pivot+1에서 시작한다.

  }

  private static int partition(int[] array, int low, int high) {
    int pivot = array[high];

    int i = low;
    for (int j = low; j<high; j++){
      if (array[j] <= pivot){
        swap(array, i, j);
        i++;
      }
    }
    swap(array, i, high);
    return i;
  }

  private static int findMedianIndex(int[] array, int low, int high) {
    int mid = (low + high) / 2;

    // low, mid, high인덱스의 값을 크기순으로 정렬해 중간값의 index 반환
    if (array[low] > array[mid]) swap(array,low,mid);
    if (array[low] > array[high]) swap(array,low,high);
    if (array[mid] > array[high]) swap(array,mid,high);

    return mid;
  }

  private static void swap(int[] array, int i, int j){
    int tmp = array[i];
    array[i] = array[j];
    array[j] = tmp;
  }

  public static void main(String[] args) {
    Random random = new Random();
    int[] array = new int[20];
    int[] array2 = new int[30];
    for (int i = 0; i < array.length; i++) {
      array[i] = random.nextInt(100); // 0~99까지 정수 랜덤
    }
    for (int i = 0; i < array2.length; i++) {
      array2[i] = random.nextInt(100); // 0~99까지 정수 랜덤
    }

    System.out.print("정렬 전 배열1 : ");
    System.out.println(Arrays.toString(array));
    System.out.println("-----------------------------------------");
    HybridQuickSort(array);
    System.out.print("Hybrid 퀵정렬 후 배열1 : ");
    System.out.println(Arrays.toString(array));
    System.out.println("-----------------------------------------");
    System.out.print("정렬 전 배열2 : ");
    System.out.println(Arrays.toString(array2));
    System.out.println("-----------------------------------------");
    HybridQuickSort(array2);
    System.out.print("Hybrid 퀵정렬 후 배열2 : ");
    System.out.println(Arrays.toString(array2));
    System.out.println("-----------------------------------------");
  }

}
