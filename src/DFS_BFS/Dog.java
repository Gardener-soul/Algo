package DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dog {
    static int maxWeight, ans = -1;
    static int[] dogs;

    public static void Solution(int level, int sum) {
        if(sum>maxWeight) return;
        if(level==dogs.length) ans=Math.max(ans,sum);
        else {
            Solution(level+1, sum+dogs[level]);
            Solution(level+1, sum);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        maxWeight = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());
        dogs = new int[num];
        for(int i=0; i<num; i++) {
            dogs[i] = Integer.parseInt(br.readLine());
        }

        Solution(0,0);
        System.out.println(ans);
    }
}
