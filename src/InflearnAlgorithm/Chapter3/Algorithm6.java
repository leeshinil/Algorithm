package InflearnAlgorithm.Chapter3;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
6. 최대 길이 연속부분수열
설명
0과 1로 구성된 길이가 N인 수열이 주어집니다. 여러분은 이 수열에서 최대 k번을 0을 1로 변경할 수 있습니다. 여러분이 최대 k번의 변경을 통해 이 수열에서 1로만 구성된 최대 길이의 연속부분수열을 찾는 프로그램을 작성하세요.
만약 길이가 길이가 14인 다음과 같은 수열이 주어지고 k=2라면
1 1 0 0 1 1 0 1 1 0 1 1 0 1
여러분이 만들 수 있는 1이 연속된 연속부분수열은
1 1 0 0 1 1 1 1 1 1 1 1
이며 그 길이는 8입니다.

입력
첫 번째 줄에 수열의 길이인 자연수 N(5<=N<100,000)이 주어집니다.
두 번째 줄에 N길이의 0과 1로 구성된 수열이 주어집니다.

출력
첫 줄에 최대 길이를 출력하세요.

input)
14 2
1 1 0 0 1 1 0 1 1 0 1 1 0 1

output)
8
 */
public class Algorithm6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        int lt = 0;
        int answer = 0;
        int cnt = k;

        for (int rt = 0; rt < num; rt++) {
            if (arr[rt] == 0) cnt--;
            while (cnt < 0) {
                if (arr[lt] == 0) cnt++;
                lt++;
            }
            answer = Math.max(answer, rt - lt + 1);
        }
        System.out.println(answer);
    }
}
