import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int[] b = Arrays.copyOf(a, n);

        Arrays.sort(b);

        Map<Integer, Integer> map = new HashMap<>();

        int index = 0;
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(b[i])) {
                map.put(b[i], index++);
            }
        }

        for (int i = 0; i < n; i++) {
            sb.append(map.get(a[i])).append(" ");
        }

        System.out.println(sb.toString());
    }
}