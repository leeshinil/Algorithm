package InflearnAlgorithm.Chapter2;

import java.util.Scanner;

/*
3. 가위 바위 보
설명
A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
예를 들어 N=5이면
두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.


입력
첫 번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다.
두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.
세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.

출력
각 줄에 각 회의 승자를 출력합니다. 비겼을 경우는 D를 출력합니다.

input)
5
2 3 3 1 3
1 1 2 2 3

output)
A
B
A
B
D
 */
public class Algorithm3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        String[] value = new String[input];
        int[][] arr = new int[2][input];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i =0; i < input; i++) {
            if (arr[0][i] == arr[1][i]) value[i] = "D";
            else if (arr[0][i]==1 && arr[1][i] == 3) value[i] = "A";
            else if (arr[0][i]==2 && arr[1][i] == 1) value[i] = "A";
            else if (arr[0][i]==3 && arr[1][i] == 2) value[i] = "A";
            else value[i] = "B";
        }
        for (int i = 0; i < input; i++) {
            System.out.println(value[i]);
        }
    }
}
