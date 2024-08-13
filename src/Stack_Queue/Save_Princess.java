package Stack_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Save_Princess {
    public static int Solution(int num, int call) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<=num; i++) {
            q.offer(i);
        }

        while(q.size()!=1) {
            for(int i=1; i<call; i++) {
                int tmp = q.poll();
                q.offer(tmp);
            }
            q.poll();
        }
        return q.poll();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int call = Integer.parseInt(st.nextToken());

        System.out.println(Solution(num, call));
    }
}
