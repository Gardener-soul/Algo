package DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Toma{
    public int x,y,cnt;

    public Toma (int x, int y, int cnt){
        this.x = x;
        this.y = y;
        this.cnt = cnt;
    }
}

public class Tomato {
    static int sero, garo, ans;
    static int[] der = {-1,0,1,0};
    static int[] dec = {0,-1,0,1};
    static int[][] arr;
    static boolean[][] chk;
    static Queue<Toma> q = new LinkedList<>();
    public static void bfs() {
        ans = 0;

        while(!q.isEmpty()) {
            Toma tmp = q.poll();

            int nr = tmp.x;
            int nc = tmp.y;

            for(int d=0; d<4; d++) {
                int dr = nr + der[d];
                int dc = nc + dec[d];

                if(dr<sero && dc<garo && dr>=0 && dc>=0 && !chk[dr][dc] && arr[dr][dc]==0) {
                    q.offer(new Toma(dr,dc,tmp.cnt+1));
                    chk[dr][dc] = true;
                }
            }

            ans = tmp.cnt;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        garo = Integer.parseInt(st.nextToken());
        sero = Integer.parseInt(st.nextToken());
        arr = new int[sero][garo];
        chk = new boolean[sero][garo];

        for(int i=0; i<sero; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<garo; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j]==-1) chk[i][j] = true;
                if(arr[i][j]==1) {
                    q.offer(new Toma(i,j,0));
                    chk[i][j] = true;
                }
            }
        }

        bfs();

        boolean flag = true;
        here: for(int i=0; i<sero; i++) {
            for(int j=0; j<garo; j++) {
                if(!chk[i][j]) {
                    flag = false;
                    break here;
                }
            }
        }

        if(!flag) System.out.println(-1);
        else System.out.println(ans);

    }
}
