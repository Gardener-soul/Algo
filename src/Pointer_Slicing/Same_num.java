package Pointer_Slicing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Same_num {
    static ArrayList<Integer> answer;
    public static void solution(int a, int b, int[] arrA, int[] arrB) {
        answer = new ArrayList<>();
        int p1=0, p2=0;

        while(p1<a && p2<b) {
            if(arrA[p1] == arrB[p2]) {
                answer.add(arrA[p1++]);
                p2++;
            }
            else if(arrA[p1]<arrB[p2]) p1++;
            else if(arrA[p1]>arrB[p2]) p2++;
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int lenA = Integer.parseInt(br.readLine());
        int[] arrA = new int[lenA];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<lenA; i++) {
            arrA[i] = Integer.parseInt(st.nextToken());
        }
        int lenB = Integer.parseInt(br.readLine());
        int[] arrB = new int[lenB];
        st = new StringTokenizer(br.readLine());
        for(int j=0; j<lenB; j++) {
            arrB[j] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arrA);
        Arrays.sort(arrB);

        solution(lenA, lenB, arrA, arrB);

        for(int i=0; i<answer.size(); i++){
            System.out.print(answer.get(i)+" ");
        }
    }
}

/*2. 공통원소 구하기
설명
A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.

입력
첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.
두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.
네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
각 집합의 원소는 1,000,000,000이하의 자연수입니다.

출력
두 집합의 공통원소를 오름차순 정렬하여 출력합니다.
* */
