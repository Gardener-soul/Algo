package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class UorD {
    public static String Solution(int[] arr) {
        String answer = "U";
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i]==arr[i+1]) return answer="D";
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[num];
        for(int i=0; i<num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(Solution(arr));

    }
}
