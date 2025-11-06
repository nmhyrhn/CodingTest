import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int isPN;
        int cnt = 0;

        for (int i=0; i<n; i++) {
            isPN = sc.nextInt();
            for(int j=2; j<=isPN; j++) {
                if(j==isPN) {
                    cnt++;
                }
                if (isPN % j ==0) {
                    break;
                }
            }
        }
        System.out.print(cnt);
    }
}