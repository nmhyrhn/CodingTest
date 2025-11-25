import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 참가자 수

        int[] shirts = new int[6];
        for (int i = 0; i < 6; i++) {
            shirts[i] = sc.nextInt();
        }

        int t = sc.nextInt(); // 티셔츠 묶음
        int p = sc.nextInt(); // 펜 묶음

        // 티셔츠 묶음 수
        int tshirtBundles = 0;
        for (int i = 0; i < 6; i++) {
            tshirtBundles += (shirts[i] + t - 1) / t; // 올림
        }

        // 펜 묶음 + 낱개
        int penBundles = n / p;
        int penSingle = n % p;

        System.out.println(tshirtBundles);
        System.out.println(penBundles + " " + penSingle);
    }
}