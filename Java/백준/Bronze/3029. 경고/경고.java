import java.io.*;
import java.util.*;

public class Main {
    private static int toSeconds(String time) {
        StringTokenizer st = new StringTokenizer(time, ":");
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        return h * 3600 + m * 60 + s;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nowStr = br.readLine();    
        String targetStr = br.readLine(); 

        int now = toSeconds(nowStr);
        int target = toSeconds(targetStr);

        int diff = target - now;

        if (diff <= 0) diff += 24 * 3600;

        int hh = diff / 3600;
        diff %= 3600;
        int mm = diff / 60;
        int ss = diff % 60;

        System.out.printf("%02d:%02d:%02d\n", hh, mm, ss);
    }
}