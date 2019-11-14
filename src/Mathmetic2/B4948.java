package Mathmetic2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B4948 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count;
        while (n != 0) {
            count = 0;
            int arr[] = new int[(2 * n) + 1];

            for (int i = 0; i <= 2 * n; i++) {
                arr[i] = 0;
            }
            arr[1] = 1;

            for (int i = 2; i <= 2 * n; i++) {
                for (int j = 2; i * j <= 2 * n; j++) {
                    arr[i * j] = 1;

                }
            }

            for (int i = n+1; i <= 2 * n; i++) {
                if (arr[i] != 1) {
                    count++;
                }
            }

            System.out.println(count);
            n = Integer.parseInt(br.readLine());
        }
    }
}
