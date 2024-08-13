package Stack_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Postfix {
    public static int Solution(String s) {
        Stack<Integer> sta = new Stack<>();

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)-'0'>=1 && s.charAt(i)-'0'<=9) {
                sta.add(s.charAt(i)-'0');
            } else {
                int tmp = 0;
                if (s.charAt(i)=='*') {
                    int rt = sta.pop();
                    int lt = sta.pop();
                    tmp=rt*lt;
                    sta.add(tmp);
                } else if (s.charAt(i)=='/') {
                    int rt = sta.pop();
                    int lt = sta.pop();
                    tmp=lt/rt;
                    sta.add(tmp);
                } else if (s.charAt(i)=='+') {
                    int rt = sta.pop();
                    int lt = sta.pop();
                    tmp=rt+lt;
                    sta.add(tmp);
                } else if (s.charAt(i)=='-') {
                    int rt = sta.pop();
                    int lt = sta.pop();
                    tmp=lt-rt;
                    sta.add(tmp);
                }
            }
        }
        return sta.pop();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(Solution(str));
    }
}

/*4. 후위식 연산(postfix)
설명
후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.
만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.

입력
첫 줄에 후위연산식이 주어집니다. 연산식의 길이는 50을 넘지 않습니다.
식은 1~9의 숫자와 +, -, *, / 연산자로만 이루어진다.

출력
연산한 결과를 출력합니다.
* */