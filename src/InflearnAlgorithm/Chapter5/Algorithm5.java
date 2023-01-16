package InflearnAlgorithm.Chapter5;

import java.util.Scanner;
import java.util.Stack;

/*
5. 쇠막대기

input1) ()(((()())(())()))(())
output1) 17

input2) (((()(()()))(())()))(()())
output2) 24
 */
public class Algorithm5 {
    public static void main(String[] args) {
        Stack<Character> stk = new Stack<>();
        Scanner stdIn = new Scanner(System.in);
        String str = stdIn.nextLine();
        int answer = 0;

        for(int i = 0; i<str.length(); i++){ //이전 인덱스 파악하기 쉽기 위해서
            if( str.charAt(i) == '('){
                stk.push('(');
            }else{
                stk.pop(); // '('빼기
                if(str.charAt(i-1) == '('){
                    answer += stk.size();
                }else{
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
