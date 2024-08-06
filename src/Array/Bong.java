package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bong {

    static int num, ans;
    static int[] der = {-1,0,1,0};
    static int[] dec = {0,-1,0,1};
    static int[][] arr;

    public static void bong() {
        for(int i=0; i<num; i++) {
            for(int j=0; j<num; j++) {
                boolean flag = false;
                for(int d=0; d<4; d++) {
                    int dr = der[d] + i;
                    int dc = dec[d] + j;
                    if(dr>=0 && dr<num && dc>=0 && dc<num) {
                        if(!(arr[i][j]>arr[dr][dc])) {
                            flag = false;
                            break;
                        }
                    }
                    flag = true;
                }
                if(flag) ans++;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
        arr = new int[num][num];
        ans = 0;

        for(int i=0; i<num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<num; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        bong();

        System.out.println(ans);

    }
}
