import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c = 100;
        int s = 100;

        for (int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a>b) {
                s -= a;
            } else if (a<b) {
                c -= b;
            }
            
        }
        System.out.println(c);
        System.out.println(s);
    }
}