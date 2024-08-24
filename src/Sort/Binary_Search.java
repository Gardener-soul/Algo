package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Binary_Search {
    public static int Solution(int[] arr, int m) {
        int answer = 0;
        int lt = 0, rt = arr.length-1;
        while(lt<=rt) {
            int mid = (lt+rt)/2;
            if(arr[mid]==m) {
                answer = mid +1;
                break;
            }
            if (arr[mid]>m) rt = mid-1;
            else lt = mid+1;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        int[] arr = new int[num];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        System.out.println(Solution(arr, target));
    }
}
