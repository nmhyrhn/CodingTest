import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] in = new int[3];     // 출근 시간
        int[] out = new int[3];    // 퇴근 시간
        int[] work = new int[3];   // 근무 시간

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            // 출근 시간
            for (int j = 0; j < 3; j++) {
                in[j] = Integer.parseInt(st.nextToken());
            }

            // 퇴근 시간
            for (int j = 0; j < 3; j++) {
                out[j] = Integer.parseInt(st.nextToken());
            }

            // 근무 시간 계산 (초 → 분 → 시 역순)
            for (int j = 2; j >= 0; j--) {
                if (out[j] < in[j]) {
                    out[j - 1]--;   // 앞 자리에서 1 빌림
                    out[j] += 60;   // 현재 자리 +60
                }
                work[j] = out[j] - in[j];
            }

            // 출력
            System.out.println(work[0] + " " + work[1] + " " + work[2]);
        }
    }
}
