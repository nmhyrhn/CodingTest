import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //n,m 입력
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        //HashSet에 N개의 문자열 저장
        Set<String> set = new HashSet<>();
        for(int i=0; i<n; i++) {
            set.add(br.readLine());
        }

        //m개의 문자열 하나씩 보면서 set.constains 확인
        //있으면 count++

        int count = 0;
        for(int i=0; i<m; i++) {
            String word = br.readLine();
            
            if (set.contains(word)) {
                count++;
            }
            
        }
        
        System.out.println(count);

        
    }
}