package Stack_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Kako_Doll {
    public static int Solution(int[][] arr, int[] act) {
        int answer = 0;
        Stack<Integer> sta = new Stack<>();

        for(int i=0; i<act.length; i++){
            int tmp = act[i]-1;

            for(int j=0; j<arr.length; j++) {
                if (arr[j][tmp] != 0) {
                    if (sta.isEmpty()) sta.add(arr[j][tmp]);
                    else if(sta.peek()==arr[j][tmp]) {
                        sta.pop();
                        answer+=2;
                    } else if(sta.peek()!=arr[j][tmp])sta.add(arr[j][tmp]);

                    arr[j][tmp]=0;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];
        StringTokenizer st;
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int num = Integer.parseInt(br.readLine());
        int[] act = new int[num];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<num; i++) {
            act[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(Solution(arr, act));
    }
}
