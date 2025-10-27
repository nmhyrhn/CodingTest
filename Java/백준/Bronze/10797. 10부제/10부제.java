import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int[] arr = new int[5];
        int count = 0;

        for (int i=0; i<5; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j=0; j<5; j++) {
            if (day == arr[j]) {
                count++;
            } else {
                continue;
            }
        }
        System.out.print(count);
    }
}