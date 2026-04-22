import java.util.*;
import java.io.*;

class Main {

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 분수
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // 두 번째 분수
        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int resultA = (a * d) + (b * c);
        int resultB = b * d;

        int g = gcd(resultA, resultB);

        System.out.println((resultA / g) + " " + (resultB / g));
    }
}