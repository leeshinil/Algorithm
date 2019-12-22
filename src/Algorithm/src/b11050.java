import java.util.Scanner;

public class b11050 {
    public static void main(String[] args) {
        int n,k;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); k = sc.nextInt();
        int bunja = 1, bunmo = 1;
        for(int i = 1; i <= n; i++) {
            bunmo *= i;
        }
        for(int j = 1; j <= k; j++) {
            bunja *= j;
        }
        for(int a = 1; a <= n-k; a++) {
            bunja *= a;
        }
        System.out.println(bunmo/bunja);

    }
}
