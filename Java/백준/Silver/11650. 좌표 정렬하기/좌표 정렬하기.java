import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
   public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        int[][] p = new int[N][2]; // N개의 (x, y) 저장

        // 입력
        for (int i = 0; i < N; i++) {
        StringTokenizer st = new StringTokenizer(br.readLine()); // ← 쉼표로 구분
        p[i][0] = Integer.parseInt(st.nextToken());
        p[i][1] = Integer.parseInt(st.nextToken());
        }

        // 정렬: x 오름차순 → 같으면 y 오름차순
        Arrays.sort(p, (a, b) -> {
            if (a[0] == b[0]) {
            return a[1] - b[1]; // x가 같으면 y를 비교
            } else {
            return a[0] - b[0]; // x가 다르면 x를 비교
        }});

        // 출력
        for (int i = 0; i < N; i++) {
            sb.append(p[i][0]).append(" ").append(p[i][1]).append("\n");
        }

        System.out.print(sb);
    }
}