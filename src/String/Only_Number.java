package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Only_Number {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] carr = br.readLine().toCharArray();
        String tmp = "";

        for(int i=0; i<carr.length; i++) {
            if(!(carr[i]>=65 && carr[i]<=122)) tmp+=carr[i];
        }
        System.out.println(Integer.parseInt(tmp));
    }
}
