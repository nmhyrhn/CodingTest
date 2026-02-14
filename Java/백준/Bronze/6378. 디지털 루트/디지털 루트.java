import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s = br.readLine();
            if (s == null) break;
            s = s.trim();

            if (s.equals("0")) break;

            // 디지털 루트 반복 계산
            while (s.length() > 1) {  
                int sum = 0;
                for (int i = 0; i < s.length(); i++) {
                    sum += (s.charAt(i) - '0');
                }
                s = String.valueOf(sum);
            }

            System.out.println(s);
        }
    }
}