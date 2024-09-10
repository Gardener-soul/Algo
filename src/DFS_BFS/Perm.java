package DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Perm {

    static int num,len;
    static boolean[] chk;
    static int[] arr, pe;

    public static void Perm(int level, int[] pe) {
        if(level==len) {
            for(int i=0; i<len; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } else {
            for(int i=1; i<=num; i++) {
                if(!chk[i]){
                    chk[i]=true;
                    arr[level] = pe[i-1];
                    Perm(level+1, pe);
                    chk[i] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        num = Integer.parseInt(st.nextToken());
        len = Integer.parseInt(st.nextToken());
        arr = new int[len];
        chk = new boolean[num+1];

        st = new StringTokenizer(br.readLine());
        pe = new int[num];
        for(int i=0; i<num; i++) {
            pe[i] = Integer.parseInt(st.nextToken());
        }

        Perm(0, pe);
    }
}
