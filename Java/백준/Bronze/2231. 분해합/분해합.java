import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 자연수

        int r = 0;

        for (int i=0;i<n; i++) {
            int num = i;
            int sum = 0;

            while(num != 0) {
                sum += num %10;
                num /= 10;
            }
            if (sum + i == n) {
                r = i;
                    break;
            }
        }

       System.out.println(r);
    }
}