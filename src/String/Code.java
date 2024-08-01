package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code {
    static int num;
    static char[] cArr;
    static String ans;
    public static void makeTwo() {
        for(int i=0; i<num; i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<7; j++){
                if(cArr[7*i+j]=='#') sb.append('1');
                else sb.append('0');
            }
            makeTen(sb);
        }
    }

    public static void makeTen(StringBuilder sb) {
        char[] tmp = sb.toString().toCharArray();
        int[] mul = {64,32,16,8,4,2,1};
        int ten = 0;

        for(int i=0; i<7; i++){
            ten += ((tmp[i]-'0') * mul[i]);
        }
        ans+= (char)ten;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
        cArr = br.readLine().toCharArray();
        ans = "";

        makeTwo();
        System.out.println(ans);
    }
}

/*
* 1. 암호 7글자씩 자름 -> 2진수로 바꾸기
* 2. 2진수 10진수로 바꾸기
* 3. 10진수 ASCII 코드를 영어로 바꾸기
* */