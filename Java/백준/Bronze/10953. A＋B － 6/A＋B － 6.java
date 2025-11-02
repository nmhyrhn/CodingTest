import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
      //여러 줄의 출력을 효율적으로 한 번에 모으기 위한 객체
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), ",");
            //한 줄을 입력받아 쉼표( , ) 기준으로 문자열을 나누는 코드
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(a+b + "\n");
        }
        System.out.print(sb);
	}
}