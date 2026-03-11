import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        // 1. 값 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] A = new int[N];
        int[] ans = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
            ans[i] = -1;
        }

        // 2. 스택으로 오큰수 구하기 (인덱스 저장)
        int[] stack = new int[N];
        int top = -1;

        for (int i = 0; i < N; i++) {
            while (top >= 0 && A[stack[top]] < A[i]) {
                ans[stack[top]] = A[i];
                top--;
            }
            stack[++top] = i;
        }

        // 3. 출력 만들기
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(ans[i]);
            if (i + 1 < N) sb.append(' ');
        }

        // 4. 출력
        System.out.print(sb.toString());
    }
}