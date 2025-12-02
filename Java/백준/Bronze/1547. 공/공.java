import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int ball = 1;

        for (int i=0; i<m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(ball == x) {
                ball = y;
            } else if (ball == y) {
                ball = x;
            }
        }

            System.out.print(ball);
        
    }
}