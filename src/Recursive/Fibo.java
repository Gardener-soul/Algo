package Recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Fibo {
    static int[] arr;
    public static int recur(int num) {
        if(arr[num]>0) return arr[num];

        if(num==1) return arr[1]=1;
        else if (num==2) return arr[2]=1;
        else return arr[num] = recur(num-2) + recur(num-1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        arr = new int[num+1];
        recur(num);

        for(int i=1; i<=num; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
