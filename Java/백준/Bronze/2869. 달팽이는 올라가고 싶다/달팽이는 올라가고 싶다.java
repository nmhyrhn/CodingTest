import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
 
		int a = in.nextInt();	// 상승
		int b = in.nextInt();	// 하강
		int v = in.nextInt(); 	// 높이
 
		int day = (v - b) / (a - b);
        
		// 나머지가 있을 경우 (잔여 블럭이 있을 경우)
		if ((v - b) % (a - b) != 0) {
			day++;
		}
		System.out.println(day);
	}
}