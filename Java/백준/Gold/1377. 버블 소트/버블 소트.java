import java.io.*;
import java.util.*;

public class Main {

    static class Node implements Comparable<Node> {
        int value;
        int index;

        Node(int value, int index) {
            this.value = value;
            this.index = index;
        }

        @Override
        public int compareTo(Node o) {
            return Integer.compare(this.value, o.value);
        }
    }

    public static void main(String[] args) throws Exception {
        // 1. 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 2. 값과 원래 위치 저장
        Node[] arr = new Node[N];
        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(br.readLine());
            arr[i] = new Node(value, i);
        }

        // 3. 값 기준 정렬
        Arrays.sort(arr);

        // 4. 최대 왼쪽 이동 거리 구하기
        int maxMove = 0;
        for (int i = 0; i < N; i++) {
            maxMove = Math.max(maxMove, arr[i].index - i);
        }

        // 5. 출력
        System.out.println(maxMove + 1);
    }
}