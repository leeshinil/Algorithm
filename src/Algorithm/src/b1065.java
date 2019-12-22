import java.util.Scanner;

public class b1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x < 100) {
            System.out.println(x);
        } else {
            int result = 99;

            for (int i = 100; i <= x; ++i) {
                result += test(i);
            }

            if (x == 1000) result--;

            System.out.println(result);
        }
    }

    private static int test(int number) {
        int num1 = number / 100 % 10;
        int num2 = number / 10 % 10;
        int num3 = number % 10;

        if (num2 * 2 == num1 + num3) {
            return 1;
        }
        return 0;
    }

}
