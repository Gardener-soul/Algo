package DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Coin {
    static int ans = 1000, price;

    public static void dfs(int[] arr, int sum, int count) {
        if(sum>price) return;
        if(count>=ans) return;
        if(sum==price) {
            ans = Math.min(ans,count);
        }
        else {
            for(int i=arr.length-1; i>=0; i--){
                dfs(arr, sum+arr[i], count+1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[num];
        for(int i=0; i<num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        price = Integer.parseInt(br.readLine());

        dfs(arr, 0, 0);
        System.out.println(ans);
    }
}
