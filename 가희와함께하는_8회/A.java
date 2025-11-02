package BaekJoon.가희와함께하는_8회;

import java.io.*;

public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String A = br.readLine();  //하차역
        String B = br.readLine();  //승차역

        if (A.equals(B)) {
            System.out.println(0);   //재승차 할인
        } else {
            System.out.println(1550); //기본 요금
        }
    }
}
