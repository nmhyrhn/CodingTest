import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            int one = 0;

            for (int j = 0; j < 4; j++) {
                int x = sc.nextInt();
                if (x == 1) {
                    one++;
                }
            }

            switch (one) {
                case 0:
                    System.out.println("D"); // 윷
                    break;
                case 1:
                    System.out.println("C"); // 걸
                    break;
                case 2:
                    System.out.println("B"); // 개
                    break;
                case 3:
                    System.out.println("A"); // 도
                    break;
                case 4:
                    System.out.println("E"); // 모
                    break;
            }
        }
    }
}