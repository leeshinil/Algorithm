package Mathmetic1;

import java.io.*;
import java.util.StringTokenizer;

public class B1011 {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int movingDistance = 0;
            int xMovingCount = 0;
            int yMovingCount = 0;

            while (true) {
                movingDistance++;

                x += movingDistance;
                xMovingCount++; // x의 이동횟수

                if (x >= y) {
                    break;
                }

                y -= movingDistance;
                yMovingCount++; // y의
                if (y <= x) {
                    break;
                }

            }
            bw.write(String.valueOf(xMovingCount + yMovingCount));
            bw.newLine();
        }
        bw.flush();
    }

}
