package Pointer_Slicing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Max_Outcome {
    public static int Solution (int cut, int max, int[] arr) {
        int sum=0;
        for(int i=0; i<cut; i++) {
            sum+=arr[i];
        }
        max=sum;
        for(int i=cut; i<arr.length; i++) {
            sum += (arr[i]-arr[i-cut]);
            max = Math.max(max, sum);
        }

        return max;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int cut = Integer.parseInt(st.nextToken());
        int[] arr = new int[num];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int max =0;
        System.out.println(Solution(cut, max, arr));
    }
}

/*3. 최대 매출
설명
현수의 아빠는 제과점을 운영합니다. 현수 아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.
만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면
12 1511 20 2510 20 19 13 15
연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.
여러분이 현수를 도와주세요.

입력
첫 줄에 N(5<=N<=100,000)과 K(2<=K<=N)가 주어집니다.
두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500이하의 음이 아닌 정수입니다.

출력
첫 줄에 최대 매출액을 출력합니다.
* */