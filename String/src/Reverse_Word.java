import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reverse_Word {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(br.readLine());
        for(int i = 0; i<repeat; i++){
            String tmp = new StringBuilder(br.readLine()).reverse().toString();
            System.out.println(tmp);
        }
    }
}