import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();

        // 단어 입력 + 길이 조건 확인 + 빈도수 저장
        for (int i = 0; i < n; i++) {
            String word = br.readLine();

            if (word.length() < m) continue;

            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // 정렬을 위해 key를 리스트로 옮김
        List<String> list = new ArrayList<>(map.keySet());

        // 정렬
        list.sort((a, b) -> {
            // 1. 자주 나오는 단어일수록 앞
            if (!map.get(a).equals(map.get(b))) {
                return map.get(b) - map.get(a);
            }

            // 2. 단어 길이가 길수록 앞
            if (a.length() != b.length()) {
                return b.length() - a.length();
            }

            // 3. 알파벳 사전순
            return a.compareTo(b);
        });

        StringBuilder sb = new StringBuilder();
        for (String word : list) {
            sb.append(word).append("\n");
        }

        System.out.print(sb);
    }
}