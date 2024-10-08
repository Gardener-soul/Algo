package Pointer_Slicing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Sum_2array {
    static ArrayList<Integer> answer;
    public static ArrayList<Integer> solution(int a, int b, int[] arr1, int[] arr2) {
        answer = new ArrayList<>();
        int p1=0, p2=0;
        while(p1<a && p2<b) {
            if(arr1[p1]<arr2[p2]) answer.add(arr1[p1++]);
            else answer.add(arr2[p2++]);
        }
        while (p1<a) answer.add(arr1[p1++]);
        while (p2<b) answer.add(arr2[p2++]);

        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int lenA = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] tmpArr = new int[lenA];
        for(int i=0; i<lenA; i++) {
            tmpArr[i] = Integer.parseInt(st.nextToken());
        }
        int lenB = Integer.parseInt(br.readLine());
        int[] tmpBrr = new int[lenB];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<lenB; i++) {
            tmpBrr[i] = Integer.parseInt(st.nextToken());
        }

        solution(lenA, lenB, tmpArr, tmpBrr);

        for(int i=0; i<answer.size(); i++) {
            System.out.print(answer.get(i) + " ");
        }
    }
}

/* 1. 두 배열 합치기
설명
오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.

입력
첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.

출력
오름차순으로 정렬된 배열을 출력합니다.
* */