import java.util.Scanner;

public class b1780 {
    public static int[][] arr;
    public static int[] result = new int[3];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n ;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        divide(0,0,n);

        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);

    }
    static boolean check(int r, int c, int n) {
        int num = arr[r][c];
        for(int i = r; i < r+n; i++) {
            for (int j = c; j < c+n; j++) {
                if(num != arr[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    static void divide(int r, int c, int n) {
        if(check(r,c,n)) {
            result[arr[r][c] +1]++;
        }
        else {
            int s = n/3;
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    divide(r+s*i,c+s*j,s);
                }
            }
        }
    }
}
