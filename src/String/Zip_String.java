package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zip_String {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        int cnt = 1;
        sb.append(str.charAt(0));

        for(int i=1; i<str.length(); i++){
            char tmp = str.charAt(i);
            if(tmp==str.charAt(i-1)) cnt++;

            else if (tmp!=str.charAt(i-1)) {
                if(cnt!=1){
                    sb.append(cnt);
                }
                sb.append(tmp);
                cnt=1;
            }
            else if (i==str.length()-1) sb.append(cnt);
        }
        if(cnt!=1) sb.append(cnt);
        System.out.println(sb);
    }
}

/*
* 11. 문자열 압축
설명
알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
단 반복횟수가 1인 경우 생략합니다.

입력
첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.

출력
첫 줄에 압축된 문자열을 출력한다.
* */
