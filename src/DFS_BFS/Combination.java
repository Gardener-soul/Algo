package DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Combination {
    static int n,m;
    static int[] combi;
    public static void com(int level, int select) {
        if(level==m) {
            for(int i=0; i<m; i++) {
                System.out.print(combi[i] + " ");
            }
            System.out.println();
        }else {
            for(int i=select; i<=n; i++) {
                combi[level] = i;
                com(level+1, select+1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        combi = new int[m];

        com(0,1);
    }
}
