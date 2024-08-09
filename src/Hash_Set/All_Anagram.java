package Hash_Set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Objects;

public class All_Anagram {

    public static int Solution (String a , String b) {
        int answer = 0, lt=0, rt=b.length()-1;
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i=0; i<b.length(); i++) {
            map2.put(b.charAt(i),map.getOrDefault(b.charAt(i),0)+1);
        }

        for(int i=0; i<rt; i++) {
            map.put(a.charAt(i),map.getOrDefault(a.charAt(i),0)+1);
        }
        for(int i = rt; i<a.length(); i++) {
            map.put(a.charAt(i),map.getOrDefault(a.charAt(i),0)+1);

            if(map.equals(map2)) answer++;

            map.put(a.charAt(lt),map.get(a.charAt(lt))-1);
            if(map.get(a.charAt(lt))==0) map.remove(a.charAt(lt));
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String all = br.readLine();
        String bigo = br.readLine();

        System.out.println(Solution(all, bigo));
    }
}
