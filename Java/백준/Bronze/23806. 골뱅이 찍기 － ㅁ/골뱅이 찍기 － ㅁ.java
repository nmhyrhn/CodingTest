import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        int H = 5 * N; 
        int W = 5 * N; 

        StringBuilder sb = new StringBuilder();

        for (int r = 0; r < H; r++) {
            if (r < N || r >= H - N) {
                for (int c = 0; c < W; c++) sb.append('@');
                sb.append('\n');
                continue;
            }

            for (int c = 0; c < N; c++) sb.append('@');
            for (int c = 0; c < 3 * N; c++) sb.append(' ');
            for (int c = 0; c < N; c++) sb.append('@');
            sb.append('\n');
        }

        System.out.print(sb.toString());
    }
}
