import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
  public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력된 문자열을 토큰 단위로 관리
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 현재 남아있는 토큰의 개수 반환
        int count = st.countTokens();

        int sum = 0;

        for (int i = 0; i < count; i++) {
            sum += Integer.parseInt(st.nextToken());
        }
        System.out.println(sum);
	}
}