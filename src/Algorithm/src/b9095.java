import java.util.Scanner;

public class b9095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[11];
        arr[0] = 1;
        for(int i = 1; i < 11; i++) {
            for(int j = 1; j <=3 ; j++) {
                if(i - j >= 0) {
                    arr[i] += arr[i-j];
                }
            }
        }
        int count = sc.nextInt();
        while(count-- > 0) {
            int n = sc.nextInt();
            System.out.println(arr[n]);
        }
    }
}
