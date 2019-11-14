package SWExpert;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S8500 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int arr[];
        int answer;
        for(int i = 0; i < num ; i ++ ) {
            answer =0;
            int testCase = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine(), " " );
            arr = new int[testCase];
            for(int j = 0; j < testCase; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            for(int j = 0; j < testCase-1; j++) {
                answer += (arr[j]+1);
            }
            answer += ((arr[testCase-1]*2) +1);
            System.out.println("#" +(i+1) + " " + answer);
        }
    }
}
