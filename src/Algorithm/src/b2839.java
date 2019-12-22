import java.util.Scanner;

public class b2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(test(x));
    }

    public static int count = 0;

    static int test(int x) {
        int f = 0;
        int t = 0;

        while (x % 5 !=0 && x >= 0) {
            x -=3;
            t++;
        }
        if(x < 0) {
            return -1;
        }

        else{
            f = x/5;
            return f+t;
        }
    }
}
