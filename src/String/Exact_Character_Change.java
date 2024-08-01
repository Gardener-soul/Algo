package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exact_Character_Change {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] carr = br.readLine().toCharArray();
        int lt = 0;
        int rt = carr.length-1;

        while(lt<rt) {
            if(carr[lt]>=65 && carr[lt]<=122 && carr[rt]>=65 && carr[rt]<=122) {
                char tmp = carr[lt];
                carr[lt] = carr[rt];
                carr[rt] = tmp;

                lt++;
                rt--;
            } else if (!(carr[lt]>=65 && carr[lt]<=122)) lt++;
            else if(!(carr[rt]>=65 && carr[rt]<=122)) rt--;
        }

        String ans = String.valueOf(carr);
        System.out.println(ans);
    }
}
