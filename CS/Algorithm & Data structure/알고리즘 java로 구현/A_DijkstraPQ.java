import java.io.*;
import java.util.*;
public class A_DijkstraPQ {
    static List<List<Node>> graph;
    static int V;
    static int[] distance;

    // 노드 클래스 생성. PQ를 활용한 비교를 위해 Comparable 구현
    static class Node implements Comparable<Node> {
        int vertex;
        int weight;

        // 생성자
        Node(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }

        // Comparable의 비교 메서드를 가중치 기준으로 오버라이드
        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.weight, other.weight);
        }
    }

    public static void dijkstra(int index) {
        // 기본 pq라서 최소힙(최소값 반환)
        Queue<Node> pq = new PriorityQueue<>();
        // 최단 거리를 저장할 배열
        distance = new int[V];
        // 배열을 최대값으로 초기화
        Arrays.fill(distance, Integer.MAX_VALUE);
        // 출발노드는 거리가 0
        distance[index] = 0;
        pq.offer(new Node(index, 0));

        while(!pq.isEmpty()){
            Node node = pq.poll();
            int nv = node.vertex;
            int nw = node.weight;

            // 꺼낸 노드의 가중치가 최단 거리 배열에 비해 크면 패스
            if(nw > distance[nv]) continue;

            // 인접한 정점을 돌면서 최단거리 배열에 비해 작으면 갱신
            for(Node linkedNode : graph.get(nv)) {
                int lv = linkedNode.vertex;
                int lw = linkedNode.weight;
                if(nw+lw < distance[lv]){
                    distance[lv] = nw+lW;
                    pq.offer(new Node(lv, distance[lv]))
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        V = Integer.parseInt(st.nextToken()); // 정점의 개수
        int E = Integer.parseInt(st.nextToken()); // 간선의 개수
        graph = new ArrayList<>();
        // 인접리스트로 그래프 생성
        for(int i=0; i<V; i++){
            graph.add(new ArrayList<>());
        }
        // 
        for(int j=0; j<E; j++){
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken()); // 시작노드
            int end = Integer.parseInt(st.nextToken()); // 도착노드
            int w = Integer.parseInt(st.nextToken()); // 가중치(거리)

            graph.get(start).add(new Node(end, w));
            // 양방향일 경우
            graph.get(end).add(new Node(start, w));
        }

        // 알고리즘 실행
        dijkstra(0);
        // 결과 출력
        for(int i=0; i<V; i++){
        	System.out.println(i+ "번 정점까지의 최단 거리는 " + distance[i]);
        }
    }
}
