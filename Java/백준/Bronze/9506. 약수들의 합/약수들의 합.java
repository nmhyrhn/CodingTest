import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());

            if (n == -1) break;

            ArrayList<Integer> list = new ArrayList<>();

            // 약수 구하기
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    list.add(i);
                }
            }

            int sum = 0;
            for (int x : list) {
                sum += x;
            }

            if (sum == n) {
                System.out.print(n + " = ");
                for (int i = 0; i < list.size(); i++) {
                    System.out.print(list.get(i));
                    if (i != list.size() - 1) {
                        System.out.print(" + ");
                    }
                }
                System.out.println();
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}