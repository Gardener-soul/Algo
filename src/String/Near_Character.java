package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Near_Character {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sarr = br.readLine().split(" ");
        String s = sarr[0];
        char t = sarr[1].charAt(0);
        char[] carr = sarr[0].toCharArray();
        ArrayList<Integer> arr = new ArrayList<>();
        int[] posArr = new int[carr.length];

        for(int i=0; i<carr.length; i++){
            if(carr[i]==t) arr.add(i);
        }

        for(int i=0; i<carr.length; i++){
            int tmp = Integer.MAX_VALUE;
            for(int j=0; j<arr.size(); j++){
                if(carr[i]!=t) {
                    posArr[i] = Math.min(Math.abs(i-arr.get(j)),tmp);
                    tmp = posArr[i];
                }
                else break;
            }
        }

        for(int i=0; i<posArr.length; i++){
            System.out.print(posArr[i]);
            if(i!=posArr.length-1) System.out.print(" ");
        }
    }
}

/*
* 10. 가장 짧은 문자거리
설명
한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.

입력
첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
문자열의 길이는 100을 넘지 않는다.

출력
첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
* */
