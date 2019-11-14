package Mathmetic2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1929 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        int arr[] = new int[end + 1];

        for (int i = 0; i <= end; i++) {
            arr[i] = 0;
        }
        arr[1] = 1;

        for (int i = 2; i <= end; i++) {
            for (int j = 2; i * j <= end; j++) {
                arr[i * j] = 1;

            }
        }

        for (int i = start; i <= end; i++) {
            if (arr[i] != 1) {
                System.out.println(i);
            }
        }

    }
}
