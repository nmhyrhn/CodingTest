import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int sum = 0;

        String num = br.readLine();

        for (int i=0; i<num.length(); i++) {
            sum += num.charAt(i)-'0';
        }
        
        System.out.println(sum);
    }
}