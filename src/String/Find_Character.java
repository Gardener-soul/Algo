package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Find_Character {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char find = br.readLine().toLowerCase().charAt(0);
        int ans = 0;

        for(int i=0; i<s.length(); i++){
            if(s.toLowerCase().charAt(i)==find) ans++;
        }

        System.out.println(ans);
    }
}
