package InflearnAlgorithm.Chapter2;

import java.util.Scanner;

/*
2. 보이는 학생
설명
선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)

입력
첫 줄에 정수 N(5<=N<=100,000)이 입력된다. 그 다음줄에 N명의 학생의 키가 앞에서부터 순서대로 주어진다.

출력
선생님이 볼 수 있는 최대학생수를 출력한다.

input)
8
130 135 148 140 145 150 150 153
output)
5
 */
public class Algorithm2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int value = 1;
        for (int i = 1; i < num; i++) {
            if (max < arr[i]) {
                value++;
                max = arr[i];
            }
        }
        System.out.println(value);
    }
}
