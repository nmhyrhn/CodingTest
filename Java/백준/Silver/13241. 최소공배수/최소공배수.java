import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int x = a;
        int y = b;

        while(y != 0) {
            int temp = x % y;
            x = y;
            y = temp;
        }

        int gcd = x;

        long lcm = (long)a / gcd * b;

        System.out.println(lcm);
    }
}