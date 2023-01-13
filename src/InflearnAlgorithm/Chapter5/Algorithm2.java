package InflearnAlgorithm.Chapter5;

import java.util.Scanner;
import java.util.Stack;

/*
2. 괄호문자제거
설명
입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.

입력
첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.

출력
남은 문자만 출력한다.

input)
(A(BC)D)EF(G(H)(IJ)K)LM(N)

output)
EFLM
 */
public class Algorithm2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(solution(s));
    }
    public static String solution(String s) {
        StringBuffer answer = new StringBuffer();
        Stack<Character> realSt = new Stack<>();
        Stack<Character> tmpSt = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                tmpSt.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                do {
                    tmpSt.pop();
                } while(tmpSt.peek() != '(');
                tmpSt.pop();
            } else {
                tmpSt.push(s.charAt(i));
            }
        }
        int size = tmpSt.size();
        for (int i = 0; i < size; i++) {
            answer.append(tmpSt.pop());
        }

        return answer.reverse().toString();
    }
}
