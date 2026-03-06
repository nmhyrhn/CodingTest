import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 1. BufferedReader를 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 2. 첫째 줄에서 재료의 개수 N을 읽어 정수로 변환
        int n = Integer.parseInt(br.readLine());

        // 3. 둘째 줄에서 목표 합 M을 읽어 정수로 변환
        int m = Integer.parseInt(br.readLine());

        // 4. 셋째 줄에서 N개의 재료 번호를 읽기 위해 StringTokenizer를 사용
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 5. 재료 번호를 저장할 배열을 생성
        int[] arr = new int[n];

        // 6. 토큰을 하나씩 꺼내 배열에 재료 번호를 저장
        for (int k = 0; k < n; k++) {
            arr[k] = Integer.parseInt(st.nextToken());
        }

        // 7. 두 포인터 탐색을 위해 배열을 오름차순 정렬
        Arrays.sort(arr);

        // 8. 첫 번째 포인터 i는 배열의 시작 인덱스로 설정
        int i = 0;

        // 9. 두 번째 포인터 j는 배열의 끝 인덱스로 설정
        int j = n - 1;

        // 10. 쌍(갑옷)의 개수를 저장
        int count = 0;

        // 11. 두 포인터가 교차하기 전까지 반복하며 합을 탐색
        while (i < j) {
            // 12. 두 포인터가 가리키는 값의 합을 계산
            int sum = arr[i] + arr[j];

            // 13. 합이 M과 같다면 개수를 증가시키고 두 포인터를 모두 이동
            if (sum == m) {
                count++;
                i++;
                j--;
            }
            // 14. 합이 M보다 크다면 합을 줄이기 위해 큰 쪽 포인터(j)를 왼쪽으로 이동
            else if (sum > m) {
                j--;
            }
            // 15. 합이 M보다 작다면 합을 키우기 위해 작은 쪽 포인터(i)를 오른쪽으로 이동
            else {
                i++;
            }
        }

        // 16. 출력
        System.out.println(count);
    }
}