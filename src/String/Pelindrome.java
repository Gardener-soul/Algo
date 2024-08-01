package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pelindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] carr = br.readLine().toLowerCase().toCharArray();
        int lt = 0;
        int rt = carr.length-1;
        boolean flag = false;

        while(lt<rt){
            if(carr[lt]==carr[rt]) {
                flag = true;
                lt++;
                rt--;
            }
            else {
                flag = false;
                break;
            }
        }

        if(!flag) System.out.println("NO");
        else System.out.println("YES");
    }
}

/*
* 7. 회문 문자열
설명
앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
단 회문을 검사할 때 대소문자를 구분하지 않습니다.
*
입력
첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
출력
첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다.
* */