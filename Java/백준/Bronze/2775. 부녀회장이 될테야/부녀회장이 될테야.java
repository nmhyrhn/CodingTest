import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] dp = new int[15][15];

        // 0층
        for (int i = 1; i < 15; i++) {
            dp[0][i] = i;
        }

        // 1층 ~ 14층
        for (int k = 1; k < 15; k++) {
            for (int n = 1; n < 15; n++) {
                dp[k][n] = dp[k][n - 1] + dp[k - 1][n];
            }
        }

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            sb.append(dp[k][n]).append("\n");
        }

        System.out.print(sb);
    }
}
