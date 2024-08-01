package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Same_Word_Delete {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String ans = String.valueOf(s.charAt(0));

        for(int i=1; i<s.length(); i++) {
            if(ans.indexOf(s.charAt(i))==-1) ans+=s.charAt(i);
        }
        System.out.println(ans);
    }
}

/*
6. 중복문자제거
설명

소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.

중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.

입력
첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.

출력
첫 줄에 중복문자가 제거된 문자열을 출력합니다.
* */