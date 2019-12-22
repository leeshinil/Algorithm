import java.util.Scanner;

public class B2579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int dp[] = new int[N + 1];
        int a[] = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            a[i] = sc.nextInt();
        }

        dp[1] = a[1];
        if (N >= 2) dp[2] = dp[1] + a[2];

        for (int i = 3; i <= N; i++) {
            dp[i] = Math.max(dp[i - 2] + a[i], dp[i - 3] + a[i - 1] + a[i]);
        }

        System.out.println(dp[N]);
    }
}
