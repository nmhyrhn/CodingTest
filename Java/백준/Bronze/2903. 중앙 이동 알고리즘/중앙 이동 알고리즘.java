import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int side = (int)Math.pow(2, n) + 1;
        int result = side * side;

        System.out.println(result);
    }
}