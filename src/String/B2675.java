package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2675 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder[] stringBuilder = new StringBuilder[num];
        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int first = Integer.parseInt(st.nextToken());
            String second = st.nextToken();
            stringBuilder[i] = new StringBuilder();

            for (int j = 0; j < second.length(); j++) {
                for (int k = 0; k < first; k++) {

                    stringBuilder[i].append(second.charAt(j));
                }
            }
            System.out.println(stringBuilder[i]);
        }
    }
}
