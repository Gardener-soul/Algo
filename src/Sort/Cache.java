package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Cache {
    public static void Solution(int cacheNum, LinkedList<Integer> cache, int[] jobs){
        for(int i=0; i<jobs.length; i++){
            int tmpCache = jobs[i], idx=-1;
            boolean chk = false;
            for(int j=0; j<cache.size(); j++) {
                if(tmpCache == cache.get(j)) {
                    chk = true;
                    idx = j;
                    break;
                }
            }
            if(!chk) {
                if(cache.size()==cacheNum) cache.removeLast();
                cache.addFirst(tmpCache);
            } else {
                cache.remove(idx);
                cache.addFirst(tmpCache);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cacheNum = Integer.parseInt(st.nextToken());
        int job = Integer.parseInt(st.nextToken());
        LinkedList<Integer> cache = new LinkedList<>();
        int[] jobs = new int[job];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<job; i++) {
            jobs[i] = Integer.parseInt(st.nextToken());
        }

        Solution(cacheNum, cache, jobs);

        for(int x : cache) {
            System.out.print(x + " ");
        }
    }
}
