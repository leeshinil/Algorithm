package Dynamic;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(solution(x));
    }
    public static int solution(int x) {
        if(x == 0) return 1;
        if(x == 1) return 1;
        return solution(x-1) + solution(x-2);

    }
}
