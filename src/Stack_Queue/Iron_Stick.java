package Stack_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Iron_Stick {
    public static int Solution(String s) {
        int answer = 0;
        Stack<Character> sta = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='(') sta.push(s.charAt(i));
            else if (s.charAt(i)==')' && s.charAt(i-1)=='(') {
                sta.pop();
                answer+=sta.size();
            }
            else if (s.charAt(i)==')' && s.charAt(i-1)==')') {
                sta.pop();
                answer+=1;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(Solution(str));
    }
}
