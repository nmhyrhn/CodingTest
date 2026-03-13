import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

				// 1. 연산 개수
        int n = Integer.parseInt(br.readLine());	

        // 2. 람다식 사용해보기
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> {
            int absA = Math.abs(a);
            int absB = Math.abs(b);
            if (absA == absB) {
                return a - b; 
            }
            // 3. 절대값 기준으로 정렬
            return absA - absB; 
        });

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());	

            if (num == 0) {	
            // 4. 0입력시 값이 없으면 0출력
                if (minHeap.isEmpty()) {	
                    sb.append("0\n");
                } else {
                    sb.append(minHeap.poll()).append('\n');	 
                }
            } else {
            // 5. 0이 아닐시 값 입력
                minHeap.offer(num);
            }
        }

        System.out.print(sb);
    }
}

