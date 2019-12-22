import java.util.Scanner;

public class decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        solution(num);
    }

    public static int solution(int num) {
        boolean flag;
        int cnt = 0;
        for (int i = 2; i <= num; i++) {
            flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag == true) {
                cnt++;
            }
        }
        return cnt;
    }
}
