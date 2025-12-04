import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] dice = new int[3];

        int max = 0;

        for (int i = 0; i < n; i++) {
            dice[0] = sc.nextInt();
            dice[1] = sc.nextInt();
            dice[2] = sc.nextInt();

            Arrays.sort(dice);

            int sum = 0;

            if (dice[0] == dice[1] && dice[1] == dice[2]) {
                // 3개 모두 같은 경우
                sum = 10000 + dice[0] * 1000;
            } else if (dice[0] == dice[1] || dice[0] == dice[2]) {
                // dice[0]이 나머지 하나와 같은 경우 (2개만 같은 경우)
                sum = 1000 + dice[0] * 100;
            } else if (dice[1] == dice[2]) {
                // dice[1]과 dice[2]가 같은 경우 (2개만 같은 경우)
                sum = 1000 + dice[1] * 100;
            } else {
                // 모두 다른 경우
                sum = dice[2] * 100;
            }

            if (sum > max) {
                max = sum;
            }
        }

        System.out.println(max);
    }
}
