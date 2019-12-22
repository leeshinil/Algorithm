import java.util.Scanner;

public class b10828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        String word;
        int top = -1;
        for (int i = 0; i < n; i++) {
            word = sc.next();
            if (word.equals("push")) {
                top++;
                num[top] = sc.nextInt();
            } else if (word.equals("pop")) {
                if (top < 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(num[top]);
                    top--;
                }
            } else if (word.equals("size")) {
                System.out.println(top + 1);
            } else if (word.equals("empty")) {
                if (top < 0) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (word.equals("top")) {
                if (top < 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(num[top]);
                }
            }

        }


    }
}
