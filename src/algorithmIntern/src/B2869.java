import java.util.Scanner;

public class B2869 {
    public static void main(String[] args) {
        int a, b, v;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        v = sc.nextInt();
        System.out.println(solution(a,b,v));
    }
    public static int solution(int a, int b, int v) {
        int dayCount = 0;
        int h=0;
        while(true) {
            dayCount++;
            h += a;
            if(h>=v) {
                break;
            }
            h -=b;
        }
        return dayCount;
    }
}
