import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
   static int attack(int t, int attackTime, int restTime) {
        int cycle = attackTime + restTime;
        int timeInCycle = t % cycle;

        // 공격 아님
        if (timeInCycle == 0) return 0;

        // 공격
        return (timeInCycle <= attackTime) ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int p = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] times = {p, m, n};

        for (int t : times) {
            int count = 0;
            count += attack(t, a, b);
            count += attack(t, c, d);
            System.out.println(count);
        }
    }
}