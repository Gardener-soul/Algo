package DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Pair2 {
    public int problem,time;
    public Pair2(int problem, int time) {
        this.problem = problem;
        this.time = time;
    }
}

public class Max_Score {
    static int ans = -1, limitTime;

    public static void dfs(Pair2[] arr, int sum, int level, int time) {
        if(time>limitTime) return;
        if(arr.length==level) ans = Math.max(ans,sum);
        else {
            dfs(arr, sum+arr[level].problem, level+1, time+arr[level].time);
            dfs(arr, sum, level+1, time);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        limitTime = Integer.parseInt(st.nextToken());
        Pair2[] arr = new Pair2[num];
        for(int i=0; i<num; i++) {
            st = new StringTokenizer(br.readLine());
            int prob = Integer.parseInt(st.nextToken());
            int limit = Integer.parseInt(st.nextToken());

            arr[i] = new Pair2(prob,limit);
        }

        dfs(arr, 0 , 0, 0);
        System.out.println(ans);
    }
}
