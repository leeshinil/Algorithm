import java.util.Scanner;

public class B11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(); // n = 동전 갯수, k = 돈
        int coin[] = new int[n+1];
        int num = 0;
        for(int i = 1; i <= n; i++) coin[i] = sc.nextInt();

        for(int i = n; i >0; i--) {
            num += k/coin[i];
            k %= coin[i];
        }
        System.out.println(num);
    }
}
