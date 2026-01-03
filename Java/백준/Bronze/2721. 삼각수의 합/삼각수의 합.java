import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < a; i++) {
			int sum = 0;
			int n = Integer.parseInt(br.readLine());
            
			for(int j = 1; j <= n; j++) {
				int m = 0;

				for(int k = 1; k <= (j + 1); k++) {
					m += k;
				}
				sum += (j * m);
			}
			System.out.println(sum);
		}
		
	}

}