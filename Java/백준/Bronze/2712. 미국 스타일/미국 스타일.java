import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double a = Double.parseDouble(st.nextToken());
            String b = st.nextToken();

            if (b.equals("kg")) {
                System.out.printf("%.4f lb%n", a * 2.2046);
            } else if (b.equals("g")) { 
                System.out.printf("%.4f l%n", a * 3.7854);
            } else if (b.equals("l")) {
                System.out.printf("%.4f g%n", a * 0.2642);
            } else if (b.equals("lb")) {
                System.out.printf("%.4f kg%n", a * 0.4536);
            }
        }
    }
}
