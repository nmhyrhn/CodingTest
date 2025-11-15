import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        int n = (int) (5 + 45 * Math.random()); 
        char[] name = new char[n];

        for (int i = 0; i < n; i++) {
            name[i] = (char) ('a' + (int)(Math.random() * 26));
        }

        int i = (int)(Math.random() * (n - 4));
        int j = (int)(Math.random() * (n - 4));
        while (i == j) {
            j = (int)(Math.random() * (n - 4));
        }
        name[i] = 'k';
        name[j] = 'u';

        name[n - 4] = 'g';
        name[n - 3] = 'w';
        name[n - 2] = 'a';
        name[n - 1] = 'n';

        name[0] = name[n - 1];

        System.out.println(new String(name));
    }	
	}