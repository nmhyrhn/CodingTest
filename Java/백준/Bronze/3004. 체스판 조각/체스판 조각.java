import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int a = n / 2;
        int b = n - a;

        int result = (a + 1) * (b + 1);
        System.out.println(result);
    }
}