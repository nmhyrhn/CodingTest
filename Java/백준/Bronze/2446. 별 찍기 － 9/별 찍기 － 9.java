import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		int n = in.nextInt();
 
		for (int i = 0; i < n; i++) {
 
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
 
			for (int k = 0; k < (2 * n - 1) - (2 * i); k++) {
				System.out.print("*");
			}
 
			System.out.println();
		}
 
		for (int i = 0; i < n - 1; i++) {	
        
			for (int j = 1; j < (n - 1) - i; j++) {	
				System.out.print(" ");
			}
 
			for (int k = 0; k < 3 + 2 * i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
 
}