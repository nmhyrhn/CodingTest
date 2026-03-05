import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 정수 N 입력받기
        int n = Integer.parseInt(br.readLine().trim());

        // 2. 필요한 변수 초기화
        // count : 경우의 수 (N 자체도 하나의 경우이므로 1로 시작)
        int count = 1;

        // start : 연속합 시작 지점
        int start = 1;

        // end : 연속합 끝 지점
        int end = 1;

        // sum : start ~ end까지의 합 (처음엔 1)
        int sum = 1;

        // 3. 투 포인터 알고리즘 시작
        // end가 n이 될 때까지 반복
        while (end != n) {

            // 3-1. 현재 구간 합이 n과 같은 경우
            if (sum == n) {
                count++;        // 경우의 수 증가
                end++;          // 끝 지점 확장
                sum += end;     // 확장된 값 더하기
            }

            // 3-2. 현재 구간 합이 n보다 큰 경우
            else if (sum > n) {
                sum -= start;   // 시작 지점 값을 빼고
                start++;        // 시작 지점 오른쪽 이동
            }

            // 3-3. 현재 구간 합이 n보다 작은 경우
            else {
                end++;          // 끝 지점 확장
                sum += end;     // 확장된 값 더하기
            }
        }

        // 4. 최종 경우의 수 출력
        System.out.println(count);
    }
}