import java.io.*;
import java.util.*;

public class Main {

    // 전체 배열을 전역으로 선언 (정렬/선택 과정에서 계속 사용)
    static int[] arr;

    public static void main(String[] args) throws Exception {

        // 빠른 입력을 위한 FastScanner 사용
        FastScanner fs = new FastScanner(System.in);

        // N: 배열 크기, K: K번째 수
        int N = fs.nextInt();
        int K = fs.nextInt();

        // 배열 생성
        arr = new int[N];

        // 배열 값 입력
        for (int i = 0; i < N; i++) {
            arr[i] = fs.nextInt();
        }

        // Quick Select 수행
        // K번째 값의 위치는 배열 기준으로 K-1
        quickSelect(0, N - 1, K - 1);

        // K번째 수 출력
        System.out.println(arr[K - 1]);
    }

    /**
     * Quick Select 알고리즘
     * 전체 정렬을 하지 않고 K번째 원소가 있는 구간만 탐색
     */
    static void quickSelect(int start, int end, int target) {

        // 탐색 범위가 존재하는 동안 반복
        while (start <= end) {

            // partition 수행 → pivot의 최종 위치 반환
            int pivot = partition(start, end);

            // pivot 위치가 우리가 찾는 target이면 종료
            if (pivot == target) {
                return;
            }
            // target이 pivot 왼쪽에 있음
            else if (pivot > target) {
                end = pivot - 1;
            }
            // target이 pivot 오른쪽에 있음
            else {
                start = pivot + 1;
            }
        }
    }

    /**
     * partition 함수
     * pivot 기준으로
     * pivot보다 작은 값은 왼쪽
     * pivot보다 큰 값은 오른쪽으로 이동
     */
    static int partition(int start, int end) {

        // 중간 인덱스를 pivot으로 사용
        int mid = (start + end) / 2;

        // pivot을 배열 시작 위치로 이동
        swap(start, mid);

        // pivot 값
        int pivot = arr[start];

        // 왼쪽 포인터
        int left = start + 1;

        // 오른쪽 포인터
        int right = end;

        // 두 포인터가 교차할 때까지 반복
        while (left <= right) {

            // pivot보다 작은 값은 계속 왼쪽에서 오른쪽으로 이동
            while (left <= end && arr[left] < pivot) left++;

            // pivot보다 큰 값은 계속 오른쪽에서 왼쪽으로 이동
            while (right > start && arr[right] > pivot) right--;

            // 아직 교차하지 않았다면 값 교환
            if (left <= right) {
                swap(left, right);
                left++;
                right--;
            }
        }

        // pivot을 최종 위치로 이동
        swap(start, right);

        // pivot의 최종 위치 반환
        return right;
    }

    /**
     * 배열 값 교환 함수
     */
    static void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * 대량 입력을 빠르게 처리하기 위한 FastScanner
     * BufferedReader + StringTokenizer보다 빠른 방식
     */
    static class FastScanner {

        private final InputStream in;

        // 입력 버퍼
        private final byte[] buffer = new byte[1 << 16];

        private int ptr = 0;
        private int len = 0;

        FastScanner(InputStream is) {
            in = is;
        }

        // 버퍼에서 문자 하나 읽기
        private int read() throws IOException {

            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;

                if (len <= 0) return -1;
            }

            return buffer[ptr++];
        }

        // 정수 읽기
        int nextInt() throws IOException {

            int c;

            // 공백 건너뛰기
            do {
                c = read();
            } while (c <= ' ');

            int sign = 1;

            // 음수 처리
            if (c == '-') {
                sign = -1;
                c = read();
            }

            int val = 0;

            // 숫자 읽기
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = read();
            }

            return val * sign;
        }
    }
}