package algo;

import java.util.Arrays;
import java.util.Random;

public class A_QuickSort {

  public static void quickSort(int[] array) {
    if (array.length >= 2){
      sort(array, 0, array.length-1);
    }
  }

  private static void sort(int[] array, int low, int high){
    if (low >= high) return;

    // 파티션을 나눈다.
    int mid = partition(array, low, high);
    // 나눠진 파티션에서 왼쪽과 오른쪽 부분배열을 다시 정렬한다.
    sort(array, low, mid-1);
    sort(array, mid, high);
  }

  private static int partition(int[] array, int low, int high){
    // low는 왼쪽부터 증가, high는 오른쪽부터 감소
    int mid = (low + high) / 2; // 가운데 값을 피벗으로 정한다.
    int pivot = array[mid];
    while (low <= high){        // low를 계속 증가, high를 계속 감소시켜 만나는 지점까지 while문을 실행
      while (array[low] < pivot) low++; // 피벗보다 작으면 잘 정렬되어있으므로 다음 값으로 low를 넘긴다
      while (array[high] > pivot) high--; // 피벗보다 크면 잘 정렬되어있으므로 이전 값으로 high를 줄인다
      if (low <= high) {              //위의 과정을 거쳐 정렬해야될 low와 high값의 순서가 오면
        // low와 high값을 swap한다.(작은 값을 왼쪽으로, 큰 값을 오른쪽으로 넘기는 과정)
        int tmp = array[low];
        array[low] = array[high];
        array[high] = tmp;
        low++;                        // swap이 되었으므로 다음 값으로 넘어간다.
        high--;
      }
    }
    return low;           // low는 분할된 배열의 경계값을 가진 채로 반환된다.
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
    quickSort(array);
    System.out.print("퀵정렬 후 배열 : ");
    System.out.println(Arrays.toString(array));
    System.out.println("-----------------------------------------");
  }

}
