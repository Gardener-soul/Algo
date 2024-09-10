package DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Maze_DFS {

    static int cnt = 0;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    static boolean[][] chk = new boolean[7][7];

    public static void dfs(int[][] arr, int x , int y) {

        if(x==6 && y==6) {
            cnt++;
            return;
        }

        chk[x][y] = true;

        for(int i=0; i<4; i++) {
            int nx = x+dx[i];
            int ny = y+dy[i];

            if(nx<7 & ny<7 & nx>=0 && ny>=0 && arr[nx][ny]==0 && !chk[nx][ny]) {
                dfs(arr,nx,ny);
            }
        }

        chk[x][y] = false;
    }

    public static void main(String[] args) throws IOException {
        int[][] maze = new int[7][7];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for(int r=0; r<7; r++) {
            st = new StringTokenizer(br.readLine());
            for(int c=0; c<7; c++){
                maze[r][c] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(maze,0,0);
        System.out.println(cnt);
    }
}
