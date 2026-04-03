import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); 
        int m = Integer.parseInt(st.nextToken()); 

        char[][] board = new char[n][m];

        for (int i = 0; i < n; i++) {
            String row = br.readLine();
            for (int j = 0; j < m; j++) {
                board[i][j] = row.charAt(j);
            }
        }

        int answer = Integer.MAX_VALUE;

        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {

                int countW = 0;
                int countB = 0; 

                for (int x = 0; x < 8; x++) {
                    for (int y = 0; y < 8; y++) {
                        char current = board[i + x][j + y];

                        if ((x + y) % 2 == 0) {
                            if (current != 'W') countW++;
                            if (current != 'B') countB++;
                        } 
                        else {
                            if (current != 'B') countW++;
                            if (current != 'W') countB++;
                        }
                    }
                }

                answer = Math.min(answer, Math.min(countW, countB));
            }
        }

        System.out.println(answer);
    }
}