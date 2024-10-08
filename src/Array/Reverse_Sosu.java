package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Reverse_Sosu {
    static boolean[] sosu;
    public static void makeSosu (){
        sosu = new boolean[100001];
        Arrays.fill(sosu, true);
        sosu[0] = false;
        sosu[1] = false;

        for(int i=2; i*i<100001; i++){
            if(sosu[i]) {
                for(int j=i*i; j<=100000; j+=i){
                    sosu[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[num];

        for(int i=0; i<num; i++){
            StringBuilder sb = new StringBuilder(st.nextToken());
            arr[i] = Integer.parseInt(sb.reverse().toString());
        }

        makeSosu();

        for(int i=0; i<num; i++) {
            if(arr[i]>=2){
                if(sosu[arr[i]]) System.out.print(arr[i] + " ");
            }
        }
    }
}

/*6. 뒤집은 소수
설명
N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
첫 자리부터의 연속된 0은 무시한다.

입력
첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
각 자연수의 크기는 100,000를 넘지 않는다.

출력
첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력
* */