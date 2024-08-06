package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Mentor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 학생 수
        int M = Integer.parseInt(st.nextToken()); // 테스트 수
        int[][] arr = new int[M][N];

        for(int r=0; r<M; r++) {
            st = new StringTokenizer(br.readLine());
            for(int c=0; c<N; c++) {
                arr[r][c] = Integer.parseInt(st.nextToken());
            }
        }

        boolean[][] ans = new boolean[N+1][N+1];

        for(int i=0; i<M; i++) {
            for(int j=N-1; j>=1; j--) {
                int tmp = arr[i][j];
                for(int a=j-1; a>=0; a--) {
                    int less = arr[i][a];
                    ans[tmp][less] = true;
                }
            }
        }

        int answer = 0;
        for(int i=1; i<N+1; i++) {
            for(int j=1; j<N+1; j++) {
                if(i==j) continue;
                if(!(ans[i][j])) answer++;
            }
        }
        System.out.println(answer);
    }
}
