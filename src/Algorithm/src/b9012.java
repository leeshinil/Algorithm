import java.util.Scanner;

public class b9012 {

    public static void jud(String s) {
        int x = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.toCharArray()[i] == '(') {
                x++;
            } else {
                x--;
            }
            if (x < 0) {
                System.out.println("NO");
                return;
            }
        }
        if (x == 0) System.out.println("YES");
        else System.out.println("NO");
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s[] = new String[n + 1];
        for (int i = 1; i <= n; i++) {
            s[i] = sc.next();
        }
        for (int i = 1; i <= n; i++) {
            jud(s[i]);
        }
    }
}
