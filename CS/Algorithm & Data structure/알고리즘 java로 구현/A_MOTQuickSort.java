package algo.sort;

import java.util.Arrays;
import java.util.Random;

public class A_MOTQuickSort {

  public static void MOTQuickSort(int[] array) {
    if (array.length >= 2){
      sort(array, 0, array.length-1);
    }
  }
  private static void sort(int[] array, int low, int high) {
    if (low >= high) return;

    int pivotIndex = findMedianIndex(array, low, high);
    swap(array, pivotIndex, high); // 피벗을 high(맨 오른쪽)으로 이동

    int pivot = partition(array, low, high);

    sort(array, low, pivot-1);
    sort(array, pivot+1, high); // 피벗은 이미 정렬되어있으므로 pivot+1에서 시작한다.

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
    int[] array = new int[10];
    for (int i = 0; i < array.length; i++) {
      array[i] = random.nextInt(100); // 0~99까지 정수 랜덤
    }

    System.out.print("정렬 전 배열 : ");
    System.out.println(Arrays.toString(array));
    System.out.println("-----------------------------------------");
    MOTQuickSort(array);
    System.out.print("Median of Three 퀵정렬 후 배열 : ");
    System.out.println(Arrays.toString(array));
    System.out.println("-----------------------------------------");

  }

}
