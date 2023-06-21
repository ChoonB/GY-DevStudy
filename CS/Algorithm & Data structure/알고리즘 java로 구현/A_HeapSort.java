package algo;

import java.util.Arrays;
import java.util.Random;

public class A_HeapSort {

  private static void heapSort(int[] array){
    int n = array.length;

//    heapify 과정에서 에러를 막기위해 크기가 1이나 0인 경우에는 정렬할 필요가 없으므로 바로 반환한다.
    if (n < 2) return;

//    가장 마지막 요소의 부모노드부터 시작한다.
    int startIndex = (n/2) -1;
//    일반 배열을 최대힙으로 구성
    for(int i = startIndex; i >= 0; i--){
      heapify(array, n, i);
    }

    for (int i = n-1; i > 0; i--) {
//    최대힙의 루트노드와 마지막 노드를 swap
      int tmp = array[0];
      array[0] = array[i];
      array[i] = tmp;
//    다시 최대힙 속성 유지위해 heapify
      heapify(array, i, 0);
    }

  }

  private static void heapify(int[] array, int n, int i){
//    현재 트리에서 부모노드의 자식노드 인덱스를 각각 구해준다.
    int largest = i; // 최대값을 가진 노드
    int left = i * 2 + 1; // 왼쪽 자식노드
    int right = i * 2 + 2; // 오른쪽 자식 노드

//    왼쪽 자식이 힙 범위 내에 있고, 부모보다 크면 largest를 왼쪽 자식으로 변경
    if (left < n && array[left] > array[largest]){
      largest = left;
    }
//    오른쪽 자식이 힙 범위 내에 있고, 부모보다 크면 largest를 오른쪽 자식으로 변경
    if (right < n && array[right] > array[largest]){
      largest = right;
    }
//   위의 과정을 통해 가장 큰 노드가 부모노드가 아니게되면 값을 swap해준다.
    if (largest != i){
      int tmp = array[i];
      array[i] = array[largest];
      array[largest] = tmp;

//    교환된 자식노드를 부모노드로 삼은 서브트리를 검사하도록 재귀적으로 heapify를 다시 호출한다.
      heapify(array, n, largest);
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
    heapSort(array);
    System.out.print("힙정렬 후 배열 : ");
    System.out.println(Arrays.toString(array));
    System.out.println("-----------------------------------------");
  }

}
