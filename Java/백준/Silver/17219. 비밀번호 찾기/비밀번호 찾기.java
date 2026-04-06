import java.util.*;
import java.io.*;

// 백준 제출용 클래스명은 Main
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 저장된 사이트 수 N, 찾을 사이트 수 M
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 사이트 주소(key) / 비밀번호(value) 저장
        HashMap<String, String> map = new HashMap<>();

        // N개의 사이트와 비밀번호 입력받기
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            String site = st.nextToken();      // 사이트 주소
            String password = st.nextToken();  // 비밀번호

            map.put(site, password); // map에 저장
        }

        // 출력이 많으므로 StringBuilder 사용
        StringBuilder sb = new StringBuilder();

        // M개의 사이트 주소 입력받아서 비밀번호 찾기
        for (int i = 0; i < m; i++) {
            String findSite = br.readLine(); // 찾고 싶은 사이트 주소

            sb.append(map.get(findSite)).append("\n");
        }

        // 한 번에 출력
        System.out.print(sb);
    }
}