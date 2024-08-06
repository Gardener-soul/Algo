package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Rock_Scissors_Paper {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int[][] arr = new int[2][num];

        for(int i=0; i<2; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<num; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<num; i++){
            if(arr[0][i]==arr[1][i]) System.out.println("D");
            else if((arr[0][i]==1) && arr[1][i]==2) System.out.println("B");
            else if((arr[0][i]==1) && arr[1][i]==3) System.out.println("A");
            else if((arr[0][i]==2) && arr[1][i]==1) System.out.println("A");
            else if((arr[0][i]==2) && arr[1][i]==3) System.out.println("B");
            else if((arr[0][i]==3) && arr[1][i]==1) System.out.println("B");
            else if((arr[0][i]==3) && arr[1][i]==2) System.out.println("A");
        }

    }
}
