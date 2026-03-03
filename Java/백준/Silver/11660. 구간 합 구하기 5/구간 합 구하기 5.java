import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 누적합 배열 (1-indexed)
        int[][] S = new int[N + 1][N + 1];

        // 표 입력 받으면서 누적합 채우기
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                int val = Integer.parseInt(st.nextToken());
                S[i][j] = S[i - 1][j] + S[i][j - 1] - S[i - 1][j - 1] + val;
            }
        }

        StringBuilder sb = new StringBuilder();

        // M개 질의 처리
        for (int k = 0; k < M; k++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int ans = S[x2][y2]
                    - S[x1 - 1][y2]
                    - S[x2][y1 - 1]
                    + S[x1 - 1][y1 - 1];

            sb.append(ans).append('\n');
        }

        System.out.print(sb.toString());
    }
}