package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Part_Sum {
    static int max = Integer.MIN_VALUE, num;
    static int[][] arr;
    public static void garoSero() {
        int garoTmp = 0, seroTmp = 0, xTmp=0, rightXTmp=0;
        for(int i=0; i<num; i++) {
            for(int j=0; j<num; j++) {
                if(i==j) {
                    xTmp+=arr[i][j];
                }
                else if (i+j==num-1) rightXTmp+=arr[i][j];
                seroTmp+=arr[j][i];
                garoTmp+=arr[i][j];
            }
            max = Math.max(max, Math.max(seroTmp, garoTmp));
            seroTmp = 0;
            garoTmp = 0;
        }
        max = Math.max(Math.max(xTmp,rightXTmp), max);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
        arr = new int[num][num];

        for(int i=0; i<num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<num; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        garoSero();

        System.out.println(max);
    }
}
