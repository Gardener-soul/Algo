package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Selection_Sort {
    public static int[] Solution (int num , int[] arr) {
        for (int i=0; i<num-1; i++) {
            int idx = i;
            for (int j=i+1; j<num; j++) {
                if(arr[idx] > arr[j]) idx = j;
            }
            int tmp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[num];
        for(int i=0; i<num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Solution(num, arr);

        for(int i=0; i<num; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
