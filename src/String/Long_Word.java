package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Long_Word {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int max = Integer.MIN_VALUE;
        int pos =0;
        String ans = "";

        while((pos=s.indexOf(" ")) != -1) {
            String tmp = s.substring(0,pos);
            if(tmp.length()>max) {
                max = tmp.length();
                ans = tmp;
            }
            s = s.substring(pos+1);
        }
        if(s.length()>max) ans = s;
        System.out.println(ans);

    }
}
