import java.io.*;
import java.util.*;

public class Main {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int num1 = sc.nextInt();

       while (true) {
           String op = sc.next();

           if(op.equals("=")) {
               System.out.println(num1);
               break;
           }

               int num2 = sc.nextInt();

           if(op.equals("+")) {
               num1 += num2;
           } else if(op.equals("-")) {
               num1 -= num2;
           } else if(op.equals("*")) {
               num1 *= num2;
           } else {
               num1 /= num2;
           }
        }
   }
}