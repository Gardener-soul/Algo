package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pibonachi {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        long[] arr = new long[num];
        arr[0] = 1;
        arr[1] = 1;

        for(int i=2; i<num; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }

        for (int i=0; i<num; i++){
            System.out.print(arr[i]);
            if(i!=num-1) System.out.print(" ");
        }
     }
}

/*4. 피보나치 수열
설명
1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.

입력
첫 줄에 총 항수 N(3<=N<=45)이 입력된다.

출력
첫 줄에 피보나치 수열을 출력합니다.
* */