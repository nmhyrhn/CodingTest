import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        int left = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                left++;
                max = a[i];
            }
        }

        int right = 0;
        max = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] > max) {
                right++;
                max = a[i];
            }
        }

        System.out.println(left);
        System.out.println(right);
    }
}