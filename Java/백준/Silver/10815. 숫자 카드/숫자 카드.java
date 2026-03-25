import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());

        
        HashSet<Integer> set = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            int num = Integer.parseInt(st.nextToken());
            set.add(num);
        }

        StringBuilder sb = new StringBuilder();
        
        int m = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++) {
            int card = Integer.parseInt(st.nextToken());
            if(set.contains(card)) {
                sb.append("1").append(" ");
            } else {
                sb.append("0").append(" ");
            }
        }
        
        System.out.println(sb);
    }
}