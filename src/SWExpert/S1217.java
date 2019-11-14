package SWExpert;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1217 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int answer = 1;
        for (int i = 1; i < 3; i++) {
            int num = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine(), " ");
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            System.out.println("#" + i + " " + multi(answer, m, n));
        }

    }


    public static int multi(int answer, int m, int n) {


        if (n > 0) {
            answer *= m;
            n--;
            return multi(answer, m, n);
        }
        return answer;

    }
}
