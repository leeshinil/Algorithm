package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class B5622 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int answer = 0;
        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == 'A' ||input.charAt(i) == 'B'||input.charAt(i) == 'C') answer += 3;
            else if(input.charAt(i) == 'D' ||input.charAt(i) == 'E'||input.charAt(i) == 'F') answer += 4;
            else if(input.charAt(i) == 'G' ||input.charAt(i) == 'H'||input.charAt(i) == 'I') answer += 5;
            else if(input.charAt(i) == 'J' ||input.charAt(i) == 'K'||input.charAt(i) == 'L') answer += 6;
            else if(input.charAt(i) == 'M' ||input.charAt(i) == 'N'||input.charAt(i) == 'O') answer += 7;
            else if(input.charAt(i) == 'P' ||input.charAt(i) == 'Q'||input.charAt(i) == 'R' || input.charAt(i) == 'S') answer += 8;
            else if(input.charAt(i) == 'T' ||input.charAt(i) == 'U'||input.charAt(i) == 'V') answer += 9;
            else if(input.charAt(i) == 'W' ||input.charAt(i) == 'X'||input.charAt(i) == 'Y' || input.charAt(i) =='Z') answer += 10;
        }



        System.out.println(answer);
    }
}
