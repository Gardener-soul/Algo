package DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class House {
    int x,y;
    public House(int x,int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "House(" + "x=" + x + ", y=" + y + ")";
    }
}

public class Pizza {
    static ArrayList<House> ho = new ArrayList<>();
    static ArrayList<House> pz = new ArrayList<>();
    static int len, house, min=Integer.MAX_VALUE;
    static int[] com;
    static int[][] map;

    public static void combi(int level, int select) {
        if(level==house) {
            int sum=0;
            for (House value : ho) {
                int dis = Integer.MAX_VALUE;
                for (int j : com) {
                    dis = Math.min(dis, Math.abs(value.x - pz.get(j).x) + Math.abs(value.y - pz.get(j).y));
                }
                sum+=dis;
            }
            min = Math.min(min, sum);
        } else {
            for(int i=select; i<len; i++) {
                com[level] = i;
                combi(level+1, i+1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        house = Integer.parseInt(st.nextToken());
        com = new int[house];
        map = new int[n][n];

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j]==1) ho.add(new House(i,j));
                else if(map[i][j]==2) pz.add(new House(i,j));
            }
        }

        len = pz.size();

        combi(0,0);
        System.out.println(min);
    }
}
