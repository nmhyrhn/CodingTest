import java.io.*;
import java.util.*;

public class Main {

    // 1. 최소 필요 DNA 개수를 저장할 배열 (A, C, G, T 순서)
    public static int[] DNA = {0, 0, 0, 0};

    // 2. 알파벳 인덱스 매핑
    // A = 0, C = 2, G = 6, T = 19 (char - 'A' 기준)
    public static int[] IDX = {0, 2, 6, 19};

    public static void main(String[] args) throws IOException {

        // 3. 입력을 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken()); // 전체 문자열 길이
        int P = Integer.parseInt(st.nextToken()); // 부분 문자열 길이

        String pwd = br.readLine().trim(); // DNA 문자열

        // 4. 최소 개수 조건
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            DNA[i] = Integer.parseInt(st.nextToken());
        }

        // 5. 현재 윈도우의 알파벳 개수를 저장할 배열
        int[] alpha = new int[20];

        // 6. 처음 P 길이만큼 문자 개수
        for (int i = 0; i < P; i++) {
            alpha[pwd.charAt(i) - 'A']++;
        }

        int res = 0; // 정답 카운트

        // 7. 슬라이딩 윈도우 시작
        for (int i = 0; i <= S - P; i++) {

            // 8. 조건을 만족하는지 확인
            int chk = 0;
            for (int j = 0; j < 4; j++) {
                if (DNA[j] <= alpha[IDX[j]]) {
                    chk++;
                }
            }

            // 9. 4개 조건 모두 만족하면 정답 증가
            if (chk == 4) {
                res++;
            }

            // 10. 윈도우를 오른쪽으로 한 칸 이동
            // 맨 앞 문자 제거, 새 문자 추가
            if (i + P < S) {
                alpha[pwd.charAt(i) - 'A']--;
                alpha[pwd.charAt(i + P) - 'A']++;
            }
        }

        // 11. 결과 출력
        System.out.println(res);
    }
}