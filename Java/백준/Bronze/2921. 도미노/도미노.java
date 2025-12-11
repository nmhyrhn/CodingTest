import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
	  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        long sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += (long) i * (n + 2);
        }

        System.out.println(sum);
    }
}