import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//무한루프
		while(true) {
			String S = br.readLine();
			//StringBuilder를 선언하면서 입력값인 S를 저장
			StringBuilder sb = new StringBuilder(S);
			//String으로 변환해서 저장, .toString()
			String Sreverse = sb.reverse().toString();
			
			//0 입력시 무한루프 탈출
			if(S.equals("0")) break;
			
			if(S.equals(Sreverse)) {
				System.out.println("yes");
			}else{
				System.out.println("no");
			}
		}
    }
}