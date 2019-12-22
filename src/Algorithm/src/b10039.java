import java.util.Scanner;

public class b10039 {
    public static void main(String[] args) {
        int a[] = new int[5];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
            if(a[i] < 40) {
                a[i] = 40;
            }
            sum += a[i];
        }
        System.out.println(sum / 5);


    }
}
