package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Score_Count {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[num];

        for(int i=0; i<num; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int score = 0, tmp=1;

        for(int i=0; i<num; i++) {
            if(arr[i]==0) {
                tmp=1;
            }
            else {
                score+=tmp;
                tmp++;
            }
        }
        System.out.println(score);
    }
}
