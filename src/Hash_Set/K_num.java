package Hash_Set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class K_num {
    public static int Solution (int num, int maxNum, int[] arr) {
        int answer = -1;
        TreeSet<Integer> tset = new TreeSet<>(Collections.reverseOrder());

        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                for(int k=j+1; k<arr.length; k++) {
                    tset.add(arr[i]+arr[j]+arr[k]);
                }
            }
        }
        int cnt = 0;
        for(int x : tset) {
            cnt++;
            if(cnt==maxNum) return x;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int maxNum = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[num];

        for(int i=0; i<num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(Solution(num, maxNum, arr));
    }
}
