import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static class Fraction {
        long num;
        long den; 
        Fraction(long num, long den) {
            this.num = num;
            this.den = den;
        }
    }

    static Fraction sum(long x, long y, long u, long v) {
        return new Fraction(x * v + u * y, y * v);
    }

    static boolean greater(Fraction a, Fraction b) {
        return a.num * b.den > b.num * a.den;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        st = new StringTokenizer(br.readLine());
        long C = Long.parseLong(st.nextToken());
        long D = Long.parseLong(st.nextToken());

        Fraction[] vals = new Fraction[4];
        vals[0] = sum(A, C, B, D); 
        vals[1] = sum(C, D, A, B); 
        vals[2] = sum(D, B, C, A); 
        vals[3] = sum(B, A, D, C);

        int bestIdx = 0;
        for (int i = 1; i < 4; i++) {
            if (greater(vals[i], vals[bestIdx])) {
                bestIdx = i;
            }
        }

        System.out.println(bestIdx);
    }
}
