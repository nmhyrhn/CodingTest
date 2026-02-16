import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        
        for (int i=1; i<=n; i++) {
            
            int b = sc.nextInt();
            
            if(i != b) sum +=1;
        }
        System.out.println(sum);
    }
}