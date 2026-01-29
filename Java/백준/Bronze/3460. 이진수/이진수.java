import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t= Integer.parseInt(br.readLine().trim());

        for (int c = 0; c < t; c++) {
            int n = Integer.parseInt(br.readLine().trim());

            int pos = 0;
            boolean first = true;

            while (n > 0) {
                if ((n & 1) == 1) {
                    if (!first) sb.append(' ');
                    sb.append(pos);
                    first = false;
                }

                n >>= 1;
                pos++;
            }

            sb.append('\n');
        }

        System.out.print(sb.toString());
    }
}