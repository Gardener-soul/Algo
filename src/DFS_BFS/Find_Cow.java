package DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Find_Cow {
    static boolean[] chk = new boolean[10001];
    static int[] dis = {-1,1,5};

    public static int Solution(int h, int c) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(h);
        chk[h] = true;
        int level = 0;

        while(!q.isEmpty()) {
            int len = q.size();

            for(int i=0; i<len; i++) {
                int tmp = q.poll();

                if(tmp==c) return level;

                for(int j=0; j<3; j++) {
                    int dt = tmp+dis[j];
                    if(dt>=1 && dt<=10000 && !chk[dt]) {
                        chk[dt]=true;
                        q.offer(dt);
                    }
                }
            }
            level++;
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hyun = Integer.parseInt(st.nextToken());
        int cow = Integer.parseInt(st.nextToken());

        System.out.println(Solution(hyun,cow));
    }
}
