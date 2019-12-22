import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b1874 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int max = 0, top = 0, tmp;
        int stack[] = new int[n];

        while(n-- > 0) {
            tmp = Integer.parseInt(br.readLine());
            if(tmp > max) {
                for(int i = max+1; i <= tmp; i++) {
                    stack[top++] = i;
                    sb.append("+\n");
                }
                max = tmp;
            } else if(stack[top-1] != tmp){
                System.out.println("\nNO");
                return;
            }
            top--;
            sb.append("-\n");

        }
        System.out.println(sb);
    }
}
