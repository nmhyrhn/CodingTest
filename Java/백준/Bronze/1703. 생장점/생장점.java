import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = br.readLine();
            if (line == null) break;

            StringTokenizer st = new StringTokenizer(line);
            int n = Integer.parseInt(st.nextToken());

            if (n == 0) break;

            int tree = 1;

            for (int i = 0; i < 2 * n; i++) {
                int b = Integer.parseInt(st.nextToken());

                if (i % 2 == 0) {
                    tree *= b;  
                } else {
                    tree -= b;  
                }
            }

            System.out.println(tree);
        }
    }
}
