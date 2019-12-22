import java.util.Scanner;

public class B1149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int list[][] = new int[N][3];
        int dp[][] = new int[N][3];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                list[i][j] = sc.nextInt();
            }
        }
        dp[0][0] = list[0][0];
        dp[0][1] = list[0][1];
        dp[0][2] = list[0][2];

        for (int i = 1; i < N; i++) {
            dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + list[i][0];
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + list[i][1];
            dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + list[i][2];
        }
        System.out.println(Math.min(Math.min(dp[N - 1][0], dp[N - 1][1]), dp[N - 1][2]));
    }
}


