import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int M = in.nextInt();
 
		int[] arr = new int[N];
 
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		
		int result = search(arr, N, M);
		System.out.println(result);
	}
 
	
	static int search(int[] arr, int N, int M) {
		int result = 0;
 
		// 3개를 고르기 때문에 첫번째 카드는 N - 2 까지만
		for (int i = 0; i < N - 2; i++) {
 
			// 두 번째 카드는 첫 번째 카드 다음부터 N - 1 까지만
			for (int j = i + 1; j < N - 1; j++) {
 
				// 세 번째 카드는 두 번째 카드 다음부터 N 까지
				for (int k = j + 1; k < N; k++) {
					
					// 3개 카드의 합 변수 temp
					int temp = arr[i] + arr[j] + arr[k];
					
					if (M == temp) {	
						return temp;
					}
					
					// 세 카드의 합이 이전 합보다 크면서 M 보다 작을 경우 result 
					if(result < temp && temp < M) {
						result = temp;
					}
				}
			}
		}
		
		return result;
	}
}