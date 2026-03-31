import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            
            // 종료 조건
            if (a == 0 && b == 0 && c == 0) break;
            
            // 가장 긴 변 찾기
            int max = Math.max(a, Math.max(b, c));
            int sum = a + b + c;
            
            // 삼각형 조건 체크
            if (max >= sum - max) {
                System.out.println("Invalid");
            } 
            // 세 변 모두 같은 경우
            else if (a == b && b == c) {
                System.out.println("Equilateral");
            } 
            // 두 변만 같은 경우
            else if (a == b || b == c || a == c) {
                System.out.println("Isosceles");
            } 
            // 모두 다른 경우
            else {
                System.out.println("Scalene");
            }
        }
    }
}