import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
  public static void main(String[] args) throws IOException {
	Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();

      for (int i=0; i<a; i++) {
          for (int j=a-i; j<a; j++) {
        System.out.print(" ");
          }
          for (int k=i; k<a; k++) {
              System.out.print("*");
          }
        System.out.println();          
      }
	}
}