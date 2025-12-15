import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 여학생
        int m = sc.nextInt(); // 남학생
        int k = sc.nextInt(); // 인턴

        int team = 0;

        while (n >= 2 && m >= 1 && (n + m) - k >= 3) {
            n -= 2;
            m -= 1;
            team++;
        }

        System.out.println(team);
    }
}