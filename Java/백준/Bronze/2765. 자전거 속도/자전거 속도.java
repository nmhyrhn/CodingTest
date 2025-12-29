import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int i = 1;

		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			double a = Double.parseDouble(st.nextToken());
			double b = Double.parseDouble(st.nextToken());
			double c = Double.parseDouble(st.nextToken());

			if(b == 0) {
				break;
			}

			c = (c / 60) / 60;
			double distance = ((((a * 3.1415927) * b) / 12) / 5280);
			double mph = (distance / c); 
			

			System.out.print("Trip #" + i + ": ");
			System.out.print(String.format("%.2f", distance) + " ");
			System.out.print(String.format("%.2f", mph));

			System.out.println();
			

			i++;
		}
	}

}