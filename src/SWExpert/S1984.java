package SWExpert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S1984 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int arr[] = new int[10];
        double sum;
        for(int i = 0; i < num; i++) {
            sum = 0;
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < 10; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            for(int k = 1; k < 9; k++) {
                sum += arr[k];
            }
            sum /= 8;
            System.out.println("#" + (i + 1) + " " + Math.round(sum));
        }
    }
}

