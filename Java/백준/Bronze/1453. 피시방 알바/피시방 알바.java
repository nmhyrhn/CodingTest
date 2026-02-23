import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean[] used = new boolean[101]; //
        int rejected = 0;

        for (int i = 0; i < n; i++) {
            int seat = sc.nextInt();
            if (used[seat]) {
                rejected++;
            } else {
                used[seat] = true;
            }
        }

        System.out.println(rejected);
        sc.close();
    }
}