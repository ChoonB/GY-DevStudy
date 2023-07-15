package algo;

import java.util.LinkedList;
import java.util.Queue;

public class A_BfsQ {
  // 노드에 방문한 기록을 boolean 배열로 표현. 0번 노드는 제외한다.
  private static boolean[] checked = new boolean[11];
  // 노드가 연결된 정보를 2차원 배열로 표현
  private static int[][] graph = {{},
      {2,3,4},
      {1,5,7},
      {1,6},
      {1,8},
      {2,9},
      {3,8},
      {2,9},
      {4,6},
      {5,7,10},
      {9}
  };

  public static void bfs(int v){
    // 시작 노드 방문 체크
    checked[v] = true;
    // bfs에 사용할 큐 생성
    Queue<Integer> queue = new LinkedList<>();
    // 시작 노드 큐에 삽입
    queue.add(v);
    // 큐가 빌 때 까지 while문 반복
    while(!queue.isEmpty()){
      // 큐에 있는 노드 꺼내서 방문
      int tmp = queue.poll();
      System.out.println(tmp + "번 노드를 탐색합니다.");

      // tmp의 인접 노드들 중 방문하지 않은 노드들 방문하면서 큐에 삽입
      for (int i : graph[tmp]){
        if(!checked[i]){
          queue.add(i);
          checked[i] = true;
        }
      }
    }
  }

  public static void main(String[] args) {
    int start = 1; // 시작노드
    bfs(start);
  }

}
