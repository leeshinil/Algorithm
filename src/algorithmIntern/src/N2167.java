import java.util.Scanner;

public class N2167 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        int arr[][] = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int num = sc.nextInt();
        int i, j, x, y;
        int result = 0;
        int checkArr[][] = new int[num][4];
        while (num-- > 0) {
            i = sc.nextInt();
            j = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();
            result = 0;

            for (int q = i - 1; q < x; q++) {
                for (int w = j - 1; w < y; w++) {
                    result += arr[q][w];
                }
            }
            System.out.println(result);
        }
    }
}
