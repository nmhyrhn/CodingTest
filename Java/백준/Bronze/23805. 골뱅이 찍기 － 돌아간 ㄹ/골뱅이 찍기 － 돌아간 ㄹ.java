import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        boolean[][] fill = new boolean[5][5];

        fill[0][0] = true; fill[0][1] = true; fill[0][2] = true; fill[0][4] = true;

        for (int r = 1; r <= 3; r++) {
            fill[r][0] = true; fill[r][2] = true; fill[r][4] = true;
        }

        fill[4][0] = true; fill[4][2] = true; fill[4][3] = true; fill[4][4] = true;

        String at = "@".repeat(N);
        String sp = " ".repeat(N);

        StringBuilder sb = new StringBuilder();

        for (int cellRow = 0; cellRow < 5; cellRow++) {
            for (int inner = 0; inner < N; inner++) {
                for (int cellCol = 0; cellCol < 5; cellCol++) {
                    sb.append(fill[cellRow][cellCol] ? at : sp);
                }
                sb.append('\n');
            }
        }

        System.out.print(sb.toString());
    }
}
