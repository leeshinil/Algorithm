package Study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Nqueen {
    static int count = 0;
    static int n;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            int arr[] = new int[n + 1];
            arr[1] = i;
            dfs(arr, 1);
        }
        System.out.println(count);
    }

    public static void dfs(int[] col, int row) {
        if (row == n) {
            count++;
        } else {
            for (int i = 1; i <= n; i++) {
                col[row + 1] = i;
                if (isPossible(col, row + 1)) {
                    dfs(col, row + 1);
                }
            }
        }
    }

    public static boolean isPossible(int[] col, int row) {
        for (int i = 1; i < row; i++) {
            // i 행과 row 행의 열 값이 같으면 퀸을 놓을수 없다.
            if (col[i] == col[row]) return false;

            // i 행과 row 행의 열값이 대각선에 위치하는 절대값이면 안된다.
            if (Math.abs(i - row) == Math.abs(col[i] - col[row])) return false;
        }
        return true;
    }
}
