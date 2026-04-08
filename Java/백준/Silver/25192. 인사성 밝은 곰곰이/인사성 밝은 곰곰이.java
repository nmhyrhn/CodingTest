import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            String id = br.readLine();

            if (id.equals("ENTER")) {
                set.clear(); // 새로운 입장 -> 이전 사람 기록 초기화
            } else {
                if (set.add(id)) { // 처음 말한 사람이면 true
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}