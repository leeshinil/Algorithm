package InflearnAlgorithm.Chapter2;

import java.util.ArrayList;
import java.util.Scanner;

/*
1. 큰 수 출력하기
설명
N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
(첫 번째 수는 무조건 출력한다)

입력
첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.

출력
자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.

input)
6
7 3 9 5 6 12
output)
7 9 6 12
 */
public class Algorithm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> value = new ArrayList<Integer>();

        value.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i-1]) {
                value.add(arr[i]);
            }
        }
        for (int k = 0; k < value.size(); k++) {
            System.out.print(value.get(k) + " ");
        }
    }
}
