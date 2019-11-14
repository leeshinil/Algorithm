package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1152 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int answer = 1;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                answer++;
            }
        }

        if(input.charAt(0) == ' ') answer = answer -1;
        if(input.charAt(input.length()-1) == ' ') answer -= 1;

        System.out.println(answer);
    }
}
