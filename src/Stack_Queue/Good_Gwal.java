package Stack_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Good_Gwal {

    public static String Solution(String g) {
        String ans = "NO";
        Stack<Character> sta = new Stack<>();
        for(int i=0; i<g.length(); i++) {
            if(sta.isEmpty()) sta.add(g.charAt(i));
            else if(g.charAt(i)=='(') sta.add(g.charAt(i));
            else if(sta.peek() == '(' && g.charAt(i) == ')') sta.pop();
        }
        if(sta.isEmpty()) ans="YES";
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String gwal = br.readLine();

        System.out.println(Solution(gwal));
    }
}

/*1. 올바른 괄호
설명
괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
(())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.

입력
첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.

출력
첫 번째 줄에 YES, NO를 출력한다.
* */
