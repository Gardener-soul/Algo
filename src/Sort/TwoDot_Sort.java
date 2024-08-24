package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Point implements Comparable<Point> {
    public int x,y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if(this.x==o.x) return this.y-o.y;
        else return this.x-o.x;
    }
}

public class TwoDot_Sort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        ArrayList<Point> arr = new ArrayList<>();

        for(int i=0; i<num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int tmpA = Integer.parseInt(st.nextToken());
            int tmpB = Integer.parseInt(st.nextToken());

            arr.add(new Point(tmpA, tmpB));
        }
        Collections.sort(arr);

        for(Point o : arr) System.out.println(o.x + " " + o.y);
    }
}
