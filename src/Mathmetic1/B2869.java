package Mathmetic1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2869 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        System.out.println(solution(a, b, v));
    }

    public static int solution(int a, int b, int v) {
        int dayCount = 0;
        int h = 0;
        while (true) {
            dayCount++;
            h += a;
            if (h >= v) {
                break;
            }
            h -= b;
        }
        return dayCount;
    }
}
