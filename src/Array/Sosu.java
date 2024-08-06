package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sosu {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[num+1];
        Arrays.fill(arr, true);

        arr[0] = false;
        arr[1] = false;

        for(int i=2; i*i <num; i++) {
            if (arr[i]) {
                for (int j = i*i; j <= num; j += i) {
                    arr[j] = false;
                }
            }
        }

        int ans = 0;
        for(int i=2; i<=num; i++){
            if(arr[i]) ans++;
        }
        System.out.println(ans);
    }
}

/*5. 소수(에라토스테네스 체)
설명
자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.

입력
첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.

출력
첫 줄에 소수의 개수를 출력합니다.

* */