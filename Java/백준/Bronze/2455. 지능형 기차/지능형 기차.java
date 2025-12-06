import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int current = 0; // 현재 기차 안 인원
        int max = 0;     // 최대 인원

        for (int i = 0; i < 4; i++) {
            int out = sc.nextInt();
            int in = sc.nextInt();

            current = current - out + in; // 누적 변화

            if (current > max) {
                max = current;
            }
        }
        
        System.out.println(max);
    }
}
