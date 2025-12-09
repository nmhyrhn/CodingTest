import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {

			BigInteger sum = new BigInteger("0");

			String s = br.readLine();
			BigInteger n = new BigInteger(br.readLine());
			
			for(int j = 0; j < n.intValue(); j++) {
				BigInteger m = new BigInteger(br.readLine());
				sum = sum.add(m);
			}

			String result = ((sum.remainder(n)).compareTo(BigInteger.ZERO) == 0) ? "YES" : "NO";
			
			System.out.println(result);
		}
	}
}