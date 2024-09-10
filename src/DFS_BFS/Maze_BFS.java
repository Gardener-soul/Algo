package DFS_BFS;

import Array.Part_Sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Pair{
    public int x,y,cnt;
    public Pair(int x, int y, int cnt) {
        this.x = x;
        this.y = y;
        this.cnt = cnt;
    }
}

public class Maze_BFS {
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    static boolean[][] chk = new boolean[7][7];

    public static int bfs (int[][] arr, int x, int y) {
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(x,y,0));
        chk[x][y] = true;

        while(!q.isEmpty()) {
           Pair tmp = q.poll();

           int r = tmp.x;
           int c = tmp.y;
           int cnt = tmp.cnt;

           if(r==6 && c==6) {
               return cnt;
           }

           for(int i=0; i<4; i++) {
               int nx = r + dx[i];
               int ny = c + dy[i];

               if(nx>=0 && ny>=0 && nx<7 && ny<7 && arr[nx][ny]==0 && !chk[nx][ny]) {
                   q.offer(new Pair(nx,ny,cnt+1));
                   chk[nx][ny] = true;
               }
           }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        int[][] maze = new int[7][7];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for(int r=0; r<7; r++) {
            st = new StringTokenizer(br.readLine());
            for(int c=0; c<7; c++){
                maze[r][c] = Integer.parseInt(st.nextToken());
                if(maze[r][c]==1) chk[r][c] = true;
            }
        }

        System.out.println(bfs(maze,0,0));
    }
}
