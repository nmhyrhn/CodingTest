import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int sum = a+b+c+d;

        int min = 0;
        int sec = 0;

        min = sum/60;
        sec = sum % 60;

        System.out.println(min);
        System.out.println(sec);
    }
}