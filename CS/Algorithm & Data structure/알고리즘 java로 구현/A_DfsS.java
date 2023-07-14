package algo;

import java.util.Stack;

public class A_DfsS {
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
  // v는 현재 탐색하는 노드
  public static void dfs(int v){
    // 현재 탐색하는 노드는 true로 방문 체크
    checked[v] = true;
    System.out.println(v + "번 노드를 탐색합니다.");

    // dfs에 쓸 스택 생성
    Stack<Integer> stack = new Stack<>();
    // 스택에 첫 값 넣는다.
    stack.push(v);

    // 스택이 빌 때 까지
    while (!stack.isEmpty()){
      // 일단 지금 위치 파악을 위해 스택에서 가장 윗 값 본다
      int now = stack.peek();

      boolean hasNearNode = false;
      // 현재 노드에서 연결된 노드가 graph[v]
      for (int i : graph[now]){
        // 체크되지 않은 노드만 방문한다. 스택으로 구현
        if (!checked[i]){
          // 방문처리하고 스택에 값 넣는다. 다시 백트래킹하기 위해
          hasNearNode = true;
          stack.push(i);
          checked[i] = true;
          System.out.println(i + "번 노드를 탐색합니다.");
          break;
        }
      }

      if (!hasNearNode) stack.pop();
    }

  }

  public static void main(String[] args) {
    int start = 1; // 시작노드
    dfs(start);
  }

}
