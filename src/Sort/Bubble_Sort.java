package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bubble_Sort {
    public static int[] Solution (int num , int[] arr) {
        for (int i=0; i<num-1; i++) {
            boolean swap = false;
            for(int j=0; j<num-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                    swap = true;
                }
            }
            if(!swap) break;
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
