package Study;

import java.util.Scanner;

public class RGB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int input[][] = new int[n][3];
        int dp[][] = new int[n][3];

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < 3; i++) {
                input[j][i] = sc.nextInt();
            }
        }

        dp[0][0] = input[0][0];
        dp[0][1] = input[0][1];
        dp[0][2] = input[0][2];

        for(int i = 1; i < n; i++) {
            dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + input[i][0];
            dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + input[i][1];
            dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + input[i][2];
        }

        System.out.println(Math.min(Math.min(dp[n - 1][0], dp[n - 1][1]), dp[n - 1][2]));

    }
}
