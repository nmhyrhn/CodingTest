import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); 

        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine()); 

            for (int i = 0; i < N; i++) {
                if (i == 0 || i == N - 1) {

                    for (int j = 0; j < N; j++) {
                        System.out.print("#");
                    }
                } else {
                    System.out.print("#");
                    for (int j = 0; j < N - 2; j++) {
                        System.out.print("J");
                    }
                    System.out.print("#");
                }
                System.out.println();
            }

            if (t != T - 1) {
                System.out.println();
            }
        }
    }
}
