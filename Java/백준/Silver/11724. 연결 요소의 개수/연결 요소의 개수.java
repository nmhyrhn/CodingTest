import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] graph; // 인접 리스트로 그래프 저장
    static boolean[] visited;          // 방문 체크 배열

    // DFS 탐색 함수
    static void dfs(int v) {
        visited[v] = true;            // 현재 노드 방문 처리
        for(int u : graph[v])         // 연결된 노드 탐색
            if(!visited[u]) dfs(u);   // 방문하지 않았으면 재귀 호출
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 정점 수
        int m = Integer.parseInt(st.nextToken()); // 간선 수

        graph = new ArrayList[n+1];   // 1번부터 n번까지 사용
        for(int i=1;i<=n;i++) graph[i] = new ArrayList<>();
        visited = new boolean[n+1];    // 방문 체크 초기화

        // 간선 정보 입력
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);          // 양방향 그래프
            graph[v].add(u);
        }

        int count = 0;                // 연결 요소 개수
        for(int i=1;i<=n;i++)
            if(!visited[i]) {         // 방문하지 않은 노드 발견
                dfs(i);               // DFS로 연결된 모든 노드 방문
                count++;              // 연결 요소 하나 추가
            }

        System.out.println(count);    // 결과 출력
    }
}