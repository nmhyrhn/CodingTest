import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            double price = Double.parseDouble(br.readLine());
            
            double discounted = price * 0.8;  
            
            System.out.printf("$%.2f\n", discounted);
        }
    }
}