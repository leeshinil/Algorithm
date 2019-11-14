package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1157 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] arr = new int[26];

        int len = s.length();

        // 각 글자 갯수를 arr 배열에 저장
        for(int i=0; i<len; i++) {
            int idx = Character.toLowerCase(s.charAt(i)) - 'a';
            arr[idx]++;
        }

        int max = -1;
        char answer = '?';

        for(int i=0; i<26; i++) {
            if(arr[i] > max) {
                max = arr[i];
                answer = (char) (i+65);
            } else if(arr[i] == max)
                answer = '?';
        }

        System.out.println(answer);
    }
}
