import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 첫째 줄: A의 원소 개수 N, B의 원소 개수 M
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 집합 A, B 저장용 HashSet
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();

        // 둘째 줄: 집합 A 입력
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            setA.add(Integer.parseInt(st.nextToken()));
        }

        // 셋째 줄: 집합 B 입력
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            setB.add(Integer.parseInt(st.nextToken()));
        }

        int count = 0;

        // A-B 구하기
        // A에 있는데 B에 없으면 대칭 차집합 원소
        for (int num : setA) {
            if (!setB.contains(num)) {
                count++;
            }
        }

        // B-A 구하기
        // B에 있는데 A에 없으면 대칭 차집합 원소
        for (int num : setB) {
            if (!setA.contains(num)) {
                count++;
            }
        }

        // 결과 출력
        System.out.println(count);
    }
}