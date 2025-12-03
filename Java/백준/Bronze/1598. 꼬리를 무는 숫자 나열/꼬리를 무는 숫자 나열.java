import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        // a의 좌표
        int rowA = (a - 1) % 4;
        int colA = (a - 1) / 4;

        // b의 좌표
        int rowB = (b - 1) % 4;
        int colB = (b - 1) / 4;

        int distance = Math.abs(rowA - rowB) + Math.abs(colA - colB);

        System.out.println(distance);
    }
}