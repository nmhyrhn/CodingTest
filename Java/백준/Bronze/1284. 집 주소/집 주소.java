import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String n = br.readLine();

            if (n.equals("0")) break; // 0은 종료

            int sum = 2; //여백 2cm

            for (int i = 0; i < n.length(); i++) {
                char c = n.charAt(i);

                if (c == '1') sum += 2;
                else if (c == '0') sum += 4;
                else sum += 3;

                // 숫자 사이 여백 
                if (i != n.length() - 1) {
                    sum += 1;
                }
            }

            System.out.println(sum);
        }
    }
}
