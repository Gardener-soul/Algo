package Stack_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Remove_Gwal {
    public static String Solution(String s) {
        Stack<Character> sta = new Stack<>();

        for(int i=0; i<s.length(); i++) {
            if(sta.isEmpty()) sta.add(s.charAt(i));
            else if(s.charAt(i)!=')') sta.add(s.charAt(i));
            else if (s.charAt(i)==')') {
                while(true) {
                    if(sta.isEmpty()) break;
                    if (sta.peek()!='(') sta.pop();
                    else if(sta.peek()=='(') {
                        sta.pop();
                        break;
                    }
                }
            }
        }
        int len = sta.size();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<len; i++) {
            sb.append(sta.pop());
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(Solution(str));
    }
}

/*2. 괄호문자제거
설명
입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.

입력
첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.

출력
남은 문자만 출력한다.
* */
