import java.util.Scanner;

public class b2740 {
    public static int n, m, k;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        int arr1[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        m = sc.nextInt();
        k = sc.nextInt();
        int arr2[][] = new int[m][k];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        multi(arr1, arr2);

    }

    public static void multi(int arr1[][], int arr2[][]) {
        int[][] result = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                for (int k = 0; k < arr1[0].length; k++) {
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
