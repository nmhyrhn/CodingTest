import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[]  arr = new int[5];
        int sum = 0;

        for (int i=0; i<5; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr);

        int avg = sum /5;
        int mid = arr[2];
        
        System.out.println(avg);
        System.out.println(mid);
    }
}