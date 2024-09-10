package DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Same_PowerSet {

    static boolean flag = false;
    static int num,total;
    static String ans = "NO";

    public static void Solution(int level, int[] arr, int sum) {
        if(flag) return;
        if(num==level) {
            if(total-sum==sum) {
                ans = "YES";
                flag = true;
            }
        } else {
            Solution(level+1, arr, sum+arr[level]);
            Solution(level+1, arr, sum);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[num];
        total=0;
        for (int i=0; i<num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            total+=arr[i];
        }

        Solution(0,arr,0);
        System.out.println(ans);

    }
}
