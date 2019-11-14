package While;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int first, second;
        int sum = 0;
        while (true) {

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            first = Integer.parseInt(st.nextToken());
            second = Integer.parseInt(st.nextToken());
            if(first == 0 && second == 0) break;;
            sum = first + second;
            System.out.println(sum);
        }
    }
}
