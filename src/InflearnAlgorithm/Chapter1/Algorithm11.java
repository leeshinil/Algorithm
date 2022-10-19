package InflearnAlgorithm.Chapter1;

import java.util.Scanner;

/*
11. 문자열 압축
설명
알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
단 반복횟수가 1인 경우 생략합니다.

입력
첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.

출력
첫 줄에 압축된 문자열을 출력한다.
input)
KKHSSSSSSSE
output)
K2HS7E
input)
KSTTTSEEKFKKKDJJGG
output)
KST3SE2KFK3DJ2G2
 */
public class Algorithm11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(solution(input));
    }

    public static String solution(String input) {
        input = input + " ";
        StringBuilder value = new StringBuilder();
        int num = 1;

        for (int i = 0; i < input.length()-1; i++) {
            if (input.charAt(i) == input.charAt(i+1)) {
                num++;
            } else {
                value.append(input.charAt(i));
                if (num > 1) {
                    value.append(num);
                }
                num = 1;
            }
        }
        return value.toString();
    }
}
