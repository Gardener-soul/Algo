package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Horse {
    public static int Solution(int[] arr, int horse) {
        int answer = 0, lt = 1, rt = arr[arr.length-1];

        while(lt<=rt) {
            int end = arr[0], hCnt=1, mid=(lt+rt)/2;

            for(int i=1; i<arr.length; i++) {
                if(arr[i]-end>=mid) {
                    hCnt++;
                    end = arr[i];
                }
            }

            if(hCnt<horse) rt = mid-1;
            else {
                answer=mid;
                lt=mid+1;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int horse = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[num];
        for(int i=0; i<num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        System.out.println(Solution(arr,horse));
    }
}
