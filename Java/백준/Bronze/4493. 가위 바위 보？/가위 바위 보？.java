import java.io.*;
import java.util.*;

class Main {
    static int win(char a, char b) {
        if (a == b) return 0;
        if ((a == 'R' && b == 'S') || (a == 'S' && b == 'P') || (a == 'P' && b == 'R')) return 1;
        return -1;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());

        for (int tc = 0; tc < t; tc++) {
            int n = Integer.parseInt(br.readLine().trim());
            int p1Win = 0, p2Win = 0;

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                char p1 = st.nextToken().charAt(0);
                char p2 = st.nextToken().charAt(0);

                int r = win(p1, p2);
                if (r == 1) p1Win++;
                else if (r == -1) p2Win++;
            }

            if (p1Win > p2Win) sb.append("Player 1\n");
            else if (p2Win > p1Win) sb.append("Player 2\n");
            else sb.append("TIE\n");
        }

        System.out.print(sb.toString());
    }
}