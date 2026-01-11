import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        int m = Integer.parseInt(br.readLine().trim());

        int cur = m;     
        int max = m;       

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int in = Integer.parseInt(st.nextToken());
            int out = Integer.parseInt(st.nextToken());

            cur = cur + in - out;

            if (cur < 0) {
                System.out.println(0);
                return;
            }

            if (cur > max) max = cur;
        }

        System.out.println(max);
    }
}