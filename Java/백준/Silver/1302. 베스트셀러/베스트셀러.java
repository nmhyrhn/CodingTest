import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        HashMap<String, Integer> map = new HashMap<>();

        for (int i=0; i<n; i++) {
            String word = br.readLine();
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        int max = 0; //팔린 권수
        String result = ""; //현재까지 베스트셀러

        for (String key : map.keySet()) {
            int count = map.get(key);

            //더 많이 팔린 경우
            if(count>max) {
                max = count;
                result = key;
            }

            //개수가 같으면 사전순 비교
            else if (count == max) {
                if(key.compareTo(result) <0) {
                    result = key;
                }
            }
            
        }
        System.out.println(result);
    }
}