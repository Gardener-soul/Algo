package Pointer_Slicing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Con_numArr {

    public static int Solution (int num, int target, int[] arr) {
        int answer = 0, tmp = 0, cnt = 0, pos = 0;

        for(int i=0; i<num; i++) {
            tmp+=arr[i];
            cnt++;
            if(cnt==1) pos = i;
            else if(cnt>1 && tmp==target) {
                answer++;
                tmp=0;
                i=pos++;
            } else if (cnt>1 && tmp>target) {
                tmp=0;
                i=pos++;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        int[] arr = new int [num];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(Solution(num, target, arr));

    }
}

/*4. 연속 부분수열
설명
N개의 수로 이루어진 수열이 주어집니다.
이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요.
만약 N=8, M=6이고 수열이 다음과 같다면
1 2 1 3 1 1 1 2
합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.

입력
첫째 줄에 N(1≤N≤100,000), M(1≤M≤100,000,000)이 주어진다.
수열의 원소값은 1,000을 넘지 않는 자연수이다.

출력
첫째 줄에 경우의 수를 출력한다.
* */