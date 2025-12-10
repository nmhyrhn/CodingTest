import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

// The main method must be in a class named "Main".
class Main {
	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        double seven = (double) x / y;  

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int xi = sc.nextInt();
            int yi = sc.nextInt();

            double price = (double) xi / yi;  
            if (price < seven) seven = price;  
        }

        double result = seven * 1000;

        System.out.printf("%.2f", result);
    }
}