package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Tmp_Master {
    static int num;
    static int[] ans;
    static int[][] arr;

    public static void chk() {
        for(int i=0; i<num; i++) {
            for(int j=0; j<num; j++) {
                int tmp = arr[i][j];
                for(int k=0; k<5; k++) {
                    if((i!=k) && tmp==arr[k][j]) {
                        ans[i]++;
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
        arr = new int[num][5];
        StringTokenizer st;
        ans = new int[num];

        for(int i=0; i<num; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        chk();

        int max = Integer.MIN_VALUE;
        for(int i=0; i<num; i++) {
            max = Math.max(ans[i],max);
        }
        System.out.println(Arrays.toString(ans));
        for(int i=0; i<num; i++) {
            if(max==ans[i]) {
                System.out.println(i+1);
                break;
            }
        }

    }
}
