package algo.sort;

import java.util.Arrays;
import java.util.Random;

public class A_RandomPivotQuickSort {

  private static Random random = new Random();

  public static void randomQuickSort(int[] array) {
    if (array.length >= 2){
      sort(array, 0, array.length-1);
    }
  }
  private static void sort(int[] array, int low, int high) {
    if (low >= high) return;

    int pivot = partition(array, low, high);

    sort(array, low, pivot-1);
    sort(array, pivot+1, high); // 피벗은 이미 정렬되어있으므로 pivot+1에서 시작한다.

  }

  private static int partition(int[] array, int low, int high) {
    /*
    pivot을 low~high 범위에서 랜덤한 값을 뽑기위해 아래와 같이 작성한다.
    랜덤한 값으로 피벗을 설정하고 가장 오른쪽 값과 교환한다
    while 대신 for 루프 사용
    while에서는 low와 high의 투포인터로 피벗을 중간으로 설정하고 low와 high를 교환했다.
    이번 for문 코드에서는 배열을 한번만 스캔해 피벗을 기준으로 나눈다.
    i는 피벗보다 작거나 같은 원소의 구역, j는 현재 검사하고있는 원소의 인덱스다.
    array[j]가 피벗보다 작거나 같으면 array[i],[j]를 교환하고 i를 1씩 증가시킨다.
    이렇게하면 피벗보다 작거나 같은 원소들이 피벗의 왼쪽에, 오른쪽에는 큰 원소들이 위치하게된다.
    그리고 마지막에 피벗을 high 오른쪽 끝으로 이동시켜 고정시킨다.
     */
    int pivotIndex = random.nextInt(high-low+1) + low;
    swap(array, pivotIndex, high);
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
    randomQuickSort(array);
    System.out.print("퀵정렬 후 배열 : ");
    System.out.println(Arrays.toString(array));
    System.out.println("-----------------------------------------");
  }


}
