import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Make_Lower_Upper {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String ans = "";

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)-'0'<=48) ans+=s.toLowerCase().charAt(i);
            else ans+=s.toUpperCase().charAt(i);
        }
        System.out.println(ans);
    }
}