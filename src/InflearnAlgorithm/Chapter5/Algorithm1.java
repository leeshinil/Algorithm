package InflearnAlgorithm.Chapter5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/*
1. 올바른 괄호
설명
괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
(())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.

입력
첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.

출력
첫 번째 줄에 YES, NO를 출력한다.

input)
(()(()))(()

output)
NO

 */
public class Algorithm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // queue
        /*Queue<String> que = new LinkedList<String>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                que.add(Character.toString(s.charAt(i)));
            } else {
                que.poll();
            }
        }
        if (que.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }*/
        // stack
        System.out.println(solution(s));
    }
    public static String solution(String s) {
        String answer = "YES";
        Stack<Character> st = new Stack<>();
        for (char x: s.toCharArray()) {
            if (x == '(') st.push(x);
            else {
                if (st.isEmpty()) return "NO";
                st.pop();
            }
        }
        if (!st.isEmpty()) return "NO";
        return answer;
    }
}
