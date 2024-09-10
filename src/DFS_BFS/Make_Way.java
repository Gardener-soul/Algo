package DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Make_Way {
    static int node, ans=0;
    static boolean[] chk;
    public static void dfs (int[][] graph, int start) {
        if(start==node-1) {
            ans++;
        }
        else{
            for(int i=1; i<graph.length; i++) {
                if(graph[start][i]==1 && !chk[start]) {
                    chk[start] = true;
                     dfs(graph,i);
                    chk[start] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        node = Integer.parseInt(st.nextToken())+1;
        int num = Integer.parseInt(st.nextToken());
        int[][] graph = new int[node][node];
        chk = new boolean[node];

        for(int i=0; i<num; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            graph[start][end] = 1;
        }

        dfs(graph,1);
        System.out.println(ans);
    }
}

