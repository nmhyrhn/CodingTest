import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] x = new int[3];
        x[0] = Integer.parseInt(st.nextToken());
        x[1] = Integer.parseInt(st.nextToken());
        x[2] = Integer.parseInt(st.nextToken());

        Arrays.sort(x);
        int a = x[0], b = x[1], c = x[2];

        int d1 = b - a;
        int d2 = c - b;

        int missing;

        if (d1 == d2) {
            missing = c + d1;
        } else if (d1 < d2) {
            missing = b + d1;
        } else {
            missing = b - d2;
        }

        System.out.println(missing);
    }
}
