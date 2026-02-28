import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String s = br.readLine();

            if (s.equals("0")) break;

            // 한 자리 될 때까지 반복
            while (s.length() > 1) {
                int sum = 0;
                for (int i = 0; i < s.length(); i++) {
                    sum += (s.charAt(i) - '0');
                }
                s = String.valueOf(sum);
            }

            sb.append(s).append('\n');
        }

        System.out.print(sb);
    }
}