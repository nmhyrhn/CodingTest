import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        // n값 받기 = 테스트 케이스 수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {

            // m값 받기 = 현재 테스트 케이스의 의상 수
            int m = Integer.parseInt(br.readLine());

            // key = 의상 종류, value = 그 종류의 개수
            HashMap<String, Integer> map = new HashMap<>();

            // m개의 의상 입력 받기
            for (int j = 0; j < m; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                String item = st.nextToken(); // 의상 이름
                String type = st.nextToken(); // 의상 종류

                // 종류별 개수 카운트
                map.put(type, map.getOrDefault(type, 0) + 1);
            }

            // 경우의 수 구하기
            int result = 1;

            for (int count : map.values()) {
                result *= (count + 1); // 안 입는 경우 포함
            }

            result -= 1; // 알몸인 경우 제외

            sb.append(result).append("\n");
        }

        System.out.print(sb);
    }
}