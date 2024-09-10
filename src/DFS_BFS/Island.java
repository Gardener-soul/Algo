package DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Ground {
    public int x,y;

    public Ground(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Island {

    static int a, ans;
    static int[] der = {-1,0,1,0,-1,-1,1,1};
    static int[] dec = {0,-1,0,1,-1,1,-1,1};
    static boolean[][] chk;
    static int[][] arr;
    static Queue<Ground> q;

    public static void bfs (int r, int c) {
        q = new LinkedList<>();
        q.offer(new Ground(r,c));
        chk[r][c] = true;

        while(!q.isEmpty()) {
            Ground tmp = q.poll();

            int nr = tmp.x;
            int nc = tmp.y;

            for(int d=0; d<8; d++) {
                int dr = nr + der[d];
                int dc = nc + dec[d];

                if(dr<a && dc<a && dr>=0 && dc>=0 && !chk[dr][dc] && arr[dr][dc]==1) {
                    q.offer(new Ground(dr,dc));
                    chk[dr][dc] = true;
                }
            }

        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        a = Integer.parseInt(br.readLine());
        arr = new int[a][a];
        chk = new boolean[a][a];

        for(int i = 0; i< a; i++) {
            st = new StringTokenizer(br.readLine());
            for(int c = 0; c< a; c++) {
                arr[i][c] = Integer.parseInt(st.nextToken());
                if(arr[i][c]==0) chk[i][c] = true;
            }
        }

        for(int i = 0; i< a; i++) {
            for(int j = 0; j< a; j++) {
                if(!chk[i][j] && arr[i][j]==1) {
                    bfs(i,j);
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}
