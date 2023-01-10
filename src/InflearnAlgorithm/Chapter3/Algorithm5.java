package InflearnAlgorithm.Chapter3;

import java.util.Scanner;

/*
5. 연속된 자연수의 합
설명
N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.
만약 N=15이면
7+8=15
4+5+6=15
1+2+3+4+5=15
와 같이 총 3가지의 경우가 존재한다.

입력
첫 번째 줄에 양의 정수 N(7<=N<1000)이 주어집니다.

출력
첫 줄에 총 경우수를 출력합니다.

input)
15

output)
3
 */
public class Algorithm5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int answer = 0;
        int sum = 0;
        for (int i = 1; i < input; i++) {
            for (int j = i; j < input; j++) {
                sum += j;
                if (sum == input) {
                    answer++;
                    break;
                } else if (sum > input) {
                    break;
                }
            }
            sum = 0;
        }
        System.out.println(answer);
    }
}
