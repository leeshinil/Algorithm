import java.util.Scanner;

public class B11055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        int dp[] = new int[n+1];
        for(int i = 1; i<= n; i++) {
            arr[i] = sc.nextInt();
            dp[i] = arr[i];
        }
        int ans=0;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j < i; j++) {
                if(arr[i] > arr[j])
                    dp[i] = Math.max(dp[j]+arr[i] ,dp[i]);
            }
            ans = Math.max(dp[i],ans);
        }
        System.out.println(ans);
    }
}
