import java.util.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 파일 개수 입력
        int n = Integer.parseInt(br.readLine());

        // 확장자를 key로 저장 + 자동 사전순 정렬
        TreeMap<String, Integer> map = new TreeMap<>();

        // 파일명 n개 입력
        for (int i = 0; i < n; i++) {
            String file = br.readLine();

            // "." 기준으로 파일명과 확장자 분리
            String[] parts = file.split("\\.");

            // 확장자만 저장
            String ext = parts[1];

            // 확장자 개수 카운트
            map.put(ext, map.getOrDefault(ext, 0) + 1);
        }

        // 결과 출력
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}