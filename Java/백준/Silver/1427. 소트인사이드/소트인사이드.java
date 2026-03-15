import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {

        // 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        // 자리수 배열로 변환
        int[] arr = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            arr[i] = input.charAt(i) - '0';
        }

        // 선택정렬 (내림차순)
        for (int i = 0; i < arr.length - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int n : arr) {
            sb.append(n);
        }

        System.out.println(sb);
    }
}