import java.util.Scanner;

public class b2747 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        int result;
        for(int i = 2; i <= n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.println(arr[n]);
        result = arr[n]%1000000;
        System.out.println(result);

    }
}
