package SWExpert;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S8457 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int answer;
        for (int i = 0; i < num; i++) {
            answer = 0;
            st = new StringTokenizer(br.readLine(), " ");

            int n = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int min, max;
            min = b - e;
            max = b + e;

            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                int x = Integer.parseInt(st.nextToken());
                for (int a = min; a <= max; a++) {
                    if (a % x == 0) {
                        answer++;
                        break;
                    }
                }
            }
            System.out.println("#" + (i + 1) + " " + answer);
        }

    }
}

