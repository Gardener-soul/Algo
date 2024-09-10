package DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Permu_Tri {

    static boolean flag = false;
    static boolean[] chk;
    static int[] res;
    static int[][] com;

    public static int combi(int n, int r) {
        if(com[n][r]>0) return com[n][r];
        if(n==r || r==0) return com[n][r]=1;
        else return com[n][r] = combi(n-1, r-1) + combi(n-1,r);
    }

    public static void Perm(int level, int num, int target) {
        if(flag) return;
        if(level==num+1) {
            int sum = 0;
            for(int i=0; i<num; i++) {
                sum+=(com[num-1][i] * res[i]);
            }
            if(sum==target) {
                for(int i=0; i<num; i++){
                    System.out.print(res[i] + " ");
                }
                flag = true;
            }
        } else {
            for(int i=1; i<=num; i++) {
                if(chk[i]) continue;

                chk[i] = true;
                res[level-1] = i;
                Perm(level+1, num, target);
                chk[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        res = new int[num];
        chk = new boolean[num+1];
        com = new int[11][11];

        for(int i=0; i<=num; i++) {
            combi(num,i);
        }
        Perm(1, num, target);
    }
}
