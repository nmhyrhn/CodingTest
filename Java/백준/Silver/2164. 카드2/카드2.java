import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++){
            list.add(i);
        }

        while (list.size() > 1){
            for (int i = 0; i < 2; i++){
                if (i == 0){
                    list.remove();
                } else {
                    list.add(list.remove());
                }
            }
        }

        sb.append(list.get(0));
        System.out.println(sb);
    }
}