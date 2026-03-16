import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 삽입 정렬 (오름차순)
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        // 누적합 계산
        int sum = 0;
        int total = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];   // 현재까지 기다린 시간
            total += sum;    // 전체 합
        }

        // 출력
        System.out.println(total);
    }
}