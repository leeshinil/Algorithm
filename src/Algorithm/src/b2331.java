import java.util.Scanner;

public class b2331 {
    public static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int answer = 0;
        for (int i = 1; i <= N; i++) {
            if(go(i)){
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }

    public static Boolean go(int n) {
        String num = String.valueOf(n);
        for (int i = 0; i < num.length(); i++) {
            n += num.charAt(i) - 48;
        }
        if (n == N)
            return true;
        else
            return false;
    }
}
