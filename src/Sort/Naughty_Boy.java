package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Naughty_Boy {
    static ArrayList<Integer> aList = new ArrayList<>();

    public static void Solution(int[] arr) {
        int[] tmp = arr.clone();
        Arrays.sort(tmp);

        for(int i=0; i<arr.length; i++) {
            if(arr[i] != tmp[i]) aList.add(i+1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[num];
        for(int i=0; i<num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Solution(arr);
        System.out.println(aList.get(0) + " " + aList.get(1));
    }
}
