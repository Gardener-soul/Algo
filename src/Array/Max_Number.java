package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Max_Number {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[num];

        for(int i=0; i<num; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arr[0]);
        for(int i=1; i<num; i++){
            if(arr[i]>arr[i-1]) ans.add(arr[i]);
        }
            System.out.print(ans);
    }
}

/*
* 1. 큰 수 출력하기
설명
N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
(첫 번째 수는 무조건 출력한다)

입력
첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.

출력
자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
* */