import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        int H = 5 * N;
        int W = 5 * N;

        StringBuilder sb = new StringBuilder();

        for (int r = 0; r < H; r++) {
            boolean middleBar = (r >= 2 * N && r < 3 * N);
            boolean bottomBar = (r >= 4 * N);

            for (int c = 0; c < W; c++) {
                boolean leftBar = (c < N);
                boolean rightBar = (c >= 4 * N && r < 4 * N); 
                boolean fullRow = middleBar || bottomBar;

                if (fullRow || leftBar || rightBar) sb.append('@');
                else sb.append(' ');
            }
            if (r < H - 1) sb.append('\n');
        }

        System.out.print(sb);
    }
}
