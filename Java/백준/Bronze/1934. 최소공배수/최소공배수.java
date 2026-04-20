import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int x = a;
            int y = b;

            // gcd 구하기
            while (y != 0) {
                int temp = x % y;
                x = y;
                y = temp;
            }

            int gcd = x;

            int lcm = (a * b) / gcd;

            System.out.println(lcm);
        }
    }
}