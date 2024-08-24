package Recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class toN {
    public static void recur(int num) {
        if(num>1) {
            recur(num-1);
        }
        System.out.print(num + " ");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        recur(num);
    }
}
