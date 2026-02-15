import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws Exception {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int v = Integer.parseInt(br.readLine()); 
        String s = br.readLine();                

        int a = 0;
        int b = 0;

        for (int i = 0; i < v; i++) {
            if (s.charAt(i) == 'A') {
                a++;
            } else {
                b++;
            }
        }

        if (a > b) {
            System.out.println("A");
        } else if (b > a) {
            System.out.println("B");
        } else {
            System.out.println("Tie");
        }
    }
}