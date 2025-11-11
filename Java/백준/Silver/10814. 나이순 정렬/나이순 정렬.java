import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {		
 
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		String[][] arr = new String[N][2];
		
 
		for(int i = 0; i < N; i++) {
			arr[i][0] = in.next();	// 나이
			arr[i][1] = in.next();	// 이름
		}
 
		
		Arrays.sort(arr, new Comparator<String[]>() {
			// 나이순으로 정렬, 비교 기준을 정의 (익명 Comparator 클래스)
			public int compare(String[] s1, String[] s2) {
                // 나이를 정수로 변환하여 오름차순 정렬
                // (나이 차이를 반환하면 오름차순 정렬이 됨)
				return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
			}
			
		});
		
		for(int i = 0; i < N; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
        
		
	}
}