package Recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PowerSet {
    static int N;
    static boolean[] chk;
    static int[] arr;
    public static void powerSet(int idx) {
        if(idx==N) {
            for(int i=0; i<N; i++) {
                if(chk[i]) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
            return;
        }

        chk[idx] = false;
        powerSet(idx+1);
        chk[idx] = true;
        powerSet(idx+1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        N=num;
        chk = new boolean[num];
        arr = new int[num];
        for(int i=0; i<num; i++) {
            arr[i] = i+1;
        }

        powerSet(0);
    }
}
