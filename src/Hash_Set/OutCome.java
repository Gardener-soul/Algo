package Hash_Set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class OutCome {
    static ArrayList<Integer> answer;
    public static ArrayList<Integer> Solution(int d, int c, int[] arr) {
        answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int lt = 0, rt = c-1;

        for(int i=0; i<rt; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i=rt; i<d; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            answer.add(map.size());
            map.put(arr[lt],map.get(arr[lt])-1);
            if(map.get(arr[lt])==0) map.remove(arr[lt]);
            lt++;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int day = Integer.parseInt(st.nextToken());
        int cut = Integer.parseInt(st.nextToken());
        int[] arr = new int[day];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<day; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Solution(day, cut, arr);

        for(int i=0; i<answer.size(); i++) {
            System.out.print(answer.get(i)+" ");
        }
    }
}
