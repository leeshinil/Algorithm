import java.util.Scanner;

public class b1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCount;
        int count = 0;
        int sosuCount;
        numCount = sc.nextInt();


        for(int i = 0; i < numCount; i++) {
            int num = sc.nextInt();
            sosuCount = 0;
            for(int j = 1; j <= num; j++) {
                if(num % j == 0) {
                    sosuCount++;
                }
            }
            if(sosuCount == 2) {
                count++;
            }
        }
        System.out.println(count);



    }
}
