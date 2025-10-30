import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
  public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

      int sum = 0;
      
      for (int i=0; i<n; i++) {
          int p = Integer.parseInt(br.readLine());
              sum += p;
      }
		
        sum -= (n - 1);
		System.out.println(sum);
	}
}