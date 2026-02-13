import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        StringBuilder abbr = new StringBuilder();

        abbr.append(s.charAt(0));

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-') {
                abbr.append(s.charAt(i + 1)); 
            }
        }

        System.out.print(abbr.toString());
    }
}
