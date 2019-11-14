package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2908 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String firstInput = st.nextToken();
        String secondInput = st.nextToken();

        StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();

        for (int i = 2; i >= 0; i--) {
            first.append(firstInput.charAt(i));
            second.append(secondInput.charAt(i));
        }
        String realFirst = first.toString();
        String realSecond = second.toString();

        int rF = Integer.parseInt(realFirst);
        int rS = Integer.parseInt(realSecond);

        if (rF > rS) {
            System.out.println(rF);
        } else if (rF < rS) {
            System.out.println(rS);
        }

    }
}
