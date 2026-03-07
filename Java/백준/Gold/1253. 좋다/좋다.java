import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        // 1. 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 2. 정렬
        Arrays.sort(arr);

        // 3. N이 2 이하이면 좋은 수 없음
        if (N <= 2) {
            System.out.println(0);
            return;
        }

        int count = 0;

        // 4. 각 원소를 기준으로 검사
        for (int result_ind = 0; result_ind < N; result_ind++) {

            int target = arr[result_ind];
            int left = 0;
            int right = N - 1;

            // 5. 투 포인터 탐색
            while (left < right) {

                // 자기 자신 제외
                if (left == result_ind) {
                    left++;
                    continue;
                }
                if (right == result_ind) {
                    right--;
                    continue;
                }

                long sum = (long) arr[left] + arr[right];

                if (sum == target) {
                    count++;
                    break;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        // 6. 결과 출력
        System.out.println(count);
    }
}