import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < 3; t++) {
            int n = Integer.parseInt(br.readLine()); // 테스트셋
            BigInteger sum = BigInteger.ZERO; // 합을 0으로 초기화

            for (int i = 0; i < n; i++) {
                BigInteger num = new BigInteger(br.readLine()); // 한 줄씩 읽어서 BigInteger로 변환
                sum = sum.add(num); // 합산
            }

            // 부호 판별
            int compare = sum.compareTo(BigInteger.ZERO);
                            //0과 비교 후 양수/음수/0 판별
            if (compare == 0) sb.append("0\n");
            else if (compare > 0) sb.append("+\n");
            else sb.append("-\n");
        }

        System.out.print(sb);
    }
}