package InflearnAlgorithm.Chapter2;

import java.util.Scanner;

/*
6. 뒤집은 소수
설명
N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
첫 자리부터의 연속된 0은 무시한다.

입력
첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
각 자연수의 크기는 100,000를 넘지 않는다.

출력
첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.

input)
9
32 55 62 20 250 370 200 30 100

output)
23 2 73 2 3
 */
public class Algorithm6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        String[] arr = new String[length];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }
        for (int i = 0; i < arr.length; i++) {
            StringBuffer sbr = new StringBuffer(arr[i]);
            String reverse = sbr.reverse().toString();
            String value = solution(Integer.parseInt(reverse));
            if (value.length() != 0) {
                sb.append(value + " ");
            }
        }
        System.out.println(sb.toString());
    }

    public static String solution(int input) {
        String value = "";
        boolean[] arrSosu = makeSosu();
        if (!arrSosu[input]) {
            value = Integer.toString(input);
        }
        return value;
    }

    public static boolean[] makeSosu() {
        boolean[] arr = new boolean[100001];
        arr[0] = arr[1] = true;
        for (int i = 2; i*i <= 100000; i++) {
            if (!arr[i]) {
                for(int j= i*i; j <= 100000; j+=i) {
                    arr[j] = true;
                }
            }
        }
        return arr;
    }
}
