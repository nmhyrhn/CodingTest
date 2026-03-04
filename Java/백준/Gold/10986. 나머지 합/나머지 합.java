import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long[] sumArr = new long[n];   // 누적합 배열
        long[] counts = new long[m];   // 나머지별 개수
        long answer = 0;               // 정답

        // 두 번째 줄 (숫자들) 읽기
        st = new StringTokenizer(br.readLine());

        // 누적합 배열 만들기
        sumArr[0] = Long.parseLong(st.nextToken());

        for (int i = 1; i < n; i++) {
            sumArr[i] = sumArr[i - 1] + Long.parseLong(st.nextToken());
        }

        // 누적합 % m 계산
        for (int i = 0; i < n; i++) {

            int remainder = (int)(sumArr[i] % m);

            // 나머지가 0이면 (1 ~ i 구간이 m으로 나누어 떨어짐)
            if (remainder == 0) {
                answer++;
            }

            counts[remainder]++;
        }

        // 같은 나머지끼리 2개씩 뽑는 조합 계산
        for (int i = 0; i < m; i++) {
            if (counts[i] > 1) {
                answer += counts[i] * (counts[i] - 1) / 2;
            }
        }

        // 출력
        System.out.println(answer);
    }
}