package InflearnAlgorithm.Chapter1;

import java.util.Scanner;

/*
설명
대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.

입력
첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
문자열은 영어 알파벳으로만 구성되어 있습니다.

출력
첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.

input)
StuDY
output)
sTUdy
 */
public class Algorithm2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(solution(input));
    }

    public static String solution(String input) {
        String value = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (65 <= c && c <= 90) {
                value += input.valueOf(c).toLowerCase();
            } else if(97 <= c && c <= 122) {
                value += input.valueOf(c).toUpperCase();
            }
        }
        return value;
    }
}
