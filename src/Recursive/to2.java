package Recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class to2 {
    static String answer = "";
    public static void recur(int num) {
        if(num==0) return;
        recur(num/2);
        answer += num%2;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        recur(num);
        System.out.println(answer);
    }
}
