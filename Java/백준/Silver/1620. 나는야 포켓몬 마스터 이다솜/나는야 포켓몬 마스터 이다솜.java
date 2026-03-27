import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();
        String[] arr = new String[n + 1];

        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            map.put(name, i);
            arr[i] = name;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            String question = br.readLine();

            if (Character.isDigit(question.charAt(0))) {
                int num = Integer.parseInt(question);
                sb.append(arr[num]).append("\n");
            } else {
                sb.append(map.get(question)).append("\n");
            }
        }

        System.out.print(sb);
    }
}