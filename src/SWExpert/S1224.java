package SWExpert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class S1224 {

    static Stack<String> str;
    static Stack<Integer> numList;


    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int k = 1;

        while (k <= 10) {
            str = new Stack<>();
            numList = new Stack<>();
            String s = "";

            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            String s1 = br.readLine();
            for (int i = 0; i < s1.length(); i++) {
                char ch = s1.charAt(i);
                switch (ch) {
                    case '(':
                        str.add(String.valueOf(ch));
                        break;
                    case '+':
                        while (!str.isEmpty() && !str.peek().equals("(")) {
                            String ch1 = str.pop();
                            s += ch1;
                        }
                        str.add(String.valueOf(ch));
                        break;
                    case '*':
                        while (!str.isEmpty() && !str.peek().equals("(") && !str.peek().equals("+")) {
                            String ch1 = str.pop();
                            s += ch1;

                        }
                        str.add(String.valueOf(ch));
                        break;
                    case ')':
                        while (!str.isEmpty() && !str.peek().equals("(")) {
                            String ch1 = str.pop();
                            s += ch1;

                        }
                        str.pop();
                        break;
                    default:
                        s += ch;
                        break;
                }
            }
//            System.out.println(s);

            for (int i = 0; i < s.length(); i++) {
                char cha = s.charAt(i);
                int num1, num2;
                if (cha == '+') {
                    num1 = numList.pop();
//                    System.out.println("+ num1 : " + num1);
                    num2 = numList.pop();
//                    System.out.println("+ num2 : " + num2);
                    numList.add(num1 + num2);
                } else if (cha == '*') {
                    num1 = numList.pop();
//                    System.out.println("* num1 : " + num1);
                    num2 = numList.pop();
//                    System.out.println("* num2 : " + num2);
                    numList.add(num1 * num2);
                } else {
                    numList.add(Integer.parseInt(String.valueOf(cha)));
                }
            }
            int result = numList.pop();
            System.out.println("#" + k + " " + result);
//            System.out.println(numList.size()+" "+str.size());
//            System.out.println(s);

            k++;
        }
    }
}