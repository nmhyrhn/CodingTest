import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    public static void main (String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
 
        // 1) N, M 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 2) 누적합 배열 만들기 (1-indexed)
        long[] prefix = new long[N + 1]; // prefix[0] = 0
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            int x = Integer.parseInt(st.nextToken());
            prefix[i] = prefix[i - 1] + x;
        }

        // 3) M개의 구간합 질의 처리
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < M; k++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            long ans = prefix[j] - prefix[i - 1];
            sb.append(ans).append('\n');
        }

        // 4) 출력
        System.out.print(sb.toString());
    }
}