import java.io.*;
import java.util.*;

public class Main {
    static long swapCount = 0; // Swap 횟수 저장

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] arr = Arrays.stream(br.readLine().split(" "))
                           .mapToLong(Long::parseLong)
                           .toArray();

        mergeSort(arr, new long[N], 0, N - 1);
        System.out.println(swapCount);
    }

    // 병합 정렬 수행
    static void mergeSort(long[] arr, long[] tmp, int left, int right) {
        if(left >= right) return;
        int mid = (left + right) / 2;
        mergeSort(arr, tmp, left, mid);
        mergeSort(arr, tmp, mid + 1, right);
        merge(arr, tmp, left, mid, right);
    }

    // 병합하며 역전수 계산
    static void merge(long[] arr, long[] tmp, int left, int mid, int right) {
        int i = left, j = mid + 1, k = left;
        while(i <= mid && j <= right) {
            if(arr[i] <= arr[j]) tmp[k++] = arr[i++];
            else {
                tmp[k++] = arr[j++];
                swapCount += mid - i + 1; // 오른쪽 요소가 왼쪽 요소보다 작으면 swap 발생
            }
        }
        while(i <= mid) tmp[k++] = arr[i++];
        while(j <= right) tmp[k++] = arr[j++];
        for(int l = left; l <= right; l++) arr[l] = tmp[l];
    }
}