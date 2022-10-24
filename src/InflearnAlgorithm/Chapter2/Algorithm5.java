package InflearnAlgorithm.Chapter2;

import java.util.Scanner;

/*
5. 소수(에라토스테네스 체)
설명
자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.

입력
첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.

출력
첫 줄에 소수의 개수를 출력합니다.
input)
20

output)
8
 */
public class Algorithm5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        boolean[] arr = new boolean[input+1];
        arr[0] = arr[1] = true;
        for (int i = 2; i*i <= input; i++) {
            if (!arr[i]) {
                for(int j= i*i; j <= input; j+=i) {
                    arr[j] = true;
                }
            }
        }
        int value = 0;
        for (int i = 1; i <= input; i++) {
            if (!arr[i]) value += 1;
        }
        System.out.println(value);
    }
}
