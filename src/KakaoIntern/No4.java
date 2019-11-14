package KakaoIntern;

import java.util.Arrays;

public class No4 {
    public static void main(String[] args) {
        int k = 10;
        long[] room_number = {1, 3, 4, 1, 3, 1};
        solution(k, room_number);
    }

    public static long[] solution(long k, long[] room_number) {
        long answer[] ={};
        boolean[] test= new boolean[room_number.length + 1];
        for(int i= 0; i <= room_number.length; i++) {
            test[i] = false;
        }
        for(int i = 0; i < room_number.length; i++) {
            test[(int) (room_number[i] -1)] = true;

        }




        return answer;
    }
}
