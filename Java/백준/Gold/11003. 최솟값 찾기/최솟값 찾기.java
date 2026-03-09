import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1. N(개수), L(구간 길이)
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        // 2. 수열 저장
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 3. 최소값 후보 인덱스를 저장할 덱
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < n; i++) {

            // 4. 현재 값보다 큰 뒤쪽 인덱스 제거
            while (!deque.isEmpty() && arr[deque.getLast()] > arr[i]) {
                deque.removeLast();
            }

            // 5. 현재 인덱스 추가
            deque.addLast(i);

            // 6. 윈도우 범위 벗어난 인덱스 제거
            if (deque.getFirst() <= i - l) {
                deque.removeFirst();
            }

            // 7. 현재 구간 최소값 출력
            bw.write(arr[deque.getFirst()] + " ");
        }

        bw.flush();
    }
}