public class A_FloydWarshall {
    // Integer.MAX_VALUE는 덧셈과정에서 overflow가 발생할 수있으므로 큰값으로 초기화
    final static int INF = 999999, V = 4;

    void floydWarshall(int graph[][]) {
        int dist[][] = new int[V][V];

        // 초기값 설정
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                dist[i][j] = graph[i][j];
            }
        }

        // 플로이드 워셜 알고리즘 적용
        for (int m = 0; m < V; m++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    if (dist[i][m] + dist[m][j] < dist[i][j])
                        dist[i][j] = dist[i][m] + dist[m][j];
                }
            }
        }

        printSolution(dist);
    }
    // 출력
    void printSolution(int dist[][]) {
        for (int i=0; i<V; ++i) {
            for (int j=0; j<V; ++j) {
                if (dist[i][j] == INF)
                    System.out.print("X   ");
                else
                    System.out.print(dist[i][j] + "   ");
            }
            System.out.println();
        }
    }

    public static void main (String[] args) {
        int graph[][] = { {0, 5, INF, 10},
                          {INF, 0, 3, INF},
                          {4, INF, 0, 1},
                          {2, 5, 8, 0} };
        A_FloydWarshall fw = new A_FloydWarshall();
        fw.floydWarshall(graph);
    }
}
