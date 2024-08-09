package Pointer_Slicing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Con_NaturalSum {
    public static int Solution(int num, int[] arr) {
        int answer = 0, pos = 0, tmp=0, cnt=0;

        for(int i=0; i<arr.length; i++) {
            tmp+=arr[i];
            cnt++;
            if(cnt==1) pos = i;
            else if (cnt>1 && tmp==num) {
                answer++;
                tmp=0;
                cnt=0;
                i=pos++;
            } else if (cnt>1 && tmp>num) {
                tmp = 0;
                cnt = 0;
                i=pos++;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[(num/2)+1];
        for (int i=0; i<num/2+1; i++) {
            arr[i] = i+1;
        }

        System.out.println(Solution(num, arr));
    }
}

/*5. 연속된 자연수의 합
설명
N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.
만약 N=15이면
7+8=15
4+5+6=15
1+2+3+4+5=15
와 같이 총 3가지의 경우가 존재한다.

입력
첫 번째 줄에 양의 정수 N(7<=N<1000)이 주어집니다.

출력
첫 줄에 총 경우수를 출력합니다.
* */