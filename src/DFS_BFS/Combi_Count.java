package DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Combi_Count {
    static int[][] combi;
    public static int DFS(int n, int r) {
        if(combi[n][r]>0) return combi[n][r];
        if(n==r || r==0) return 1;
        else return combi[n][r] = DFS(n-1,r-1) + DFS(n-1, r);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        combi = new int[n+1][r+1];

        System.out.println(DFS(n,r));
    }
}
