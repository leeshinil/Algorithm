package Function;

import java.util.Scanner;

public class B10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num > 13 || num < 0) num = sc.nextInt();
        long answer = 1;
        for(int i = 1; i <= num; i++) {
            answer *= i;
        }
        System.out.println(answer);
    }
}
