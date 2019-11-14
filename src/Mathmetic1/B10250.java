package Mathmetic1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10250 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            int third = Integer.parseInt(st.nextToken());
            String floor = String.valueOf(third% first);
            String room = String.valueOf(third / first + 1);

            if(floor.equals("0")) {
                floor = String.valueOf(first);
                room = String.valueOf(third/first);
            }
            if(room.length() == 1) {
                room = "0" + room;
            }
            System.out.println(floor + room);

        }

    }
}
