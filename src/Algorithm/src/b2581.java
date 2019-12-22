import java.util.Scanner;

public class b2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        int sum = 0;
        int min = 0;
        int i,j;
        for(i = b; i >= a; i--) {
            for(j = 2; j < i; j++) {
                if(i%j == 0) break;
            }
            if(j==i) {
                sum += i;
                min = j;
            }
        }
        System.out.println(sum == 0 ? -1 : sum + "\n" + min);

    }
}
