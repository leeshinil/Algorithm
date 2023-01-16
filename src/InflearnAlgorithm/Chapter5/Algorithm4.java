package InflearnAlgorithm.Chapter5;

import java.util.Scanner;
import java.util.Stack;

/*
4. 후위식 연산(postfix)
설명
후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.
만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.

입력
첫 줄에 후위연산식이 주어집니다. 연산식의 길이는 50을 넘지 않습니다.
식은 1~9의 숫자와 +, -, *, / 연산자로만 이루어진다.

출력
연산한 결과를 출력합니다.

input)
352+*9-

output)
12
 */
public class Algorithm4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Stack<String> stack = new Stack<>();
        int answer = 0;
        int a = 0;
        int b = 0;
        for (int i =0; i< input.length(); i++) {
            switch (input.charAt(i)) {
                case '+':
                    a = Integer.parseInt(stack.pop());
                    b = Integer.parseInt(stack.pop());
                    answer = b + a;
                    stack.push(String.valueOf(answer));
                    break;
                case '-':
                    a = Integer.parseInt(stack.pop());
                    b = Integer.parseInt(stack.pop());
                    answer = b - a;
                    stack.push(String.valueOf(answer));
                    break;
                case '*':
                    a = Integer.parseInt(stack.pop());
                    b = Integer.parseInt(stack.pop());
                    answer = b * a;
                    stack.push(String.valueOf(answer));
                    break;
                case '/':
                    a = Integer.parseInt(stack.pop());
                    b = Integer.parseInt(stack.pop());
                    answer = b / a;
                    stack.push(String.valueOf(answer));
                    break;
                default:
                    stack.push(String.valueOf(input.charAt(i)));
                    break;
            }
        }
        System.out.println(answer);
    }
}
