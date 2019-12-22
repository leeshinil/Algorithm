import java.util.Scanner;

public class b1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        sc.close();
        int count = 0;

        int n = m;
        do {
            n = (n % 10 * 10) + ((n / 10 + n % 10) % 10);
            count++;
        } while (n != m);
        System.out.println(count);
    }
}
