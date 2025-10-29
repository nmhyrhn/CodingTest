import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int tot = 0;
        for (int i=0; i<n; i++) {
            if (arr[i] == 1) {
                sum++;
                tot += sum;
            } else {
                sum = 0;
            }
        }
        System.out.print(tot);
    }
}