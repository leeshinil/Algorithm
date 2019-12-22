import java.util.Scanner;

public class B9663 {
    public static int N;
    public static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        // 각 행에는 하나의 열에만 퀸이 놓여질 수 있다.
        // 1 열부터 N열까지 돌면서 각 1행 N열에 퀸을 놓았을때 가능한 경우를 확인한다.
        for(int i = 1; i <= N; i++) {
            int[] col = new int[N+1]; // N * N 행렬이기에 열도 인덱스를 N 까지 갖을 수 있게 한다.

            // 1행 i열에 퀸을 놓았다.
            col[1] = i;
            // 1행 i열에 퀸을 놓았을 경우 가능한 횟수를 dfs로 구한다.
            dfs(col, 1);
        }

        System.out.println(count);
    }
    public static void dfs(int[] col, int row) {
        if(row == N) {
            count++;
        }else {
            // 1열 부터 N 열까지 반복하면서 (row+1, i)에 퀸을 놓을 수 있는경우가 있는지 확인한다.
            // 있으면 다음행의 dfs를 호출한다.
            for(int i = 1; i <= N; i++) {
                col[row+1] = i;
                if(isPossible(col, row+1)) {
                    dfs(col, row+1);
                }
            }
        }
    }

    public static boolean isPossible(int[] col, int row) {
        for(int i=1; i < row; i++) {
            // i 행과 row 행의 열 값이 같으면 퀸을 놓을수 없다.
            if(col[i] == col[row]) return false;

            // i 행과 row 행의 열값이 대각선에 위치하는 절대값이면 안된다.
            if(Math.abs(i - row) == Math.abs(col[i] - col[row])) return false;
        }
        return true;
    }



}
