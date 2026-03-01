import java.io.*;

class Main {
    static int reverseInt(int x) {
        int rev = 0;
        while (x > 0) {
            rev = rev * 10 + (x % 10);
            x /= 10;
        }
        return rev;
    }

    static boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int T = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine().trim());

            int sum = n + reverseInt(n);

            if (isPalindrome(String.valueOf(sum))) out.append("YES\n");
            else out.append("NO\n");
        }

        System.out.print(out);
    }
}