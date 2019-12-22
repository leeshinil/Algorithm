import java.util.Scanner;

public class b2455 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = 0;
        int max = 0;

        for (int i = 0; i < 4; i++) {
            left = left - sc.nextInt();
            left = left + sc.nextInt();

            if (max < left)
                max = left;
        }
        System.out.println(max);
    }
}
