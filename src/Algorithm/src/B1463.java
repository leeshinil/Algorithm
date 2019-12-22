import java.util.Scanner;

public class B1463 {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int arr[] = new int[n+1];
//        arr[1] = 0;
//
//        for(int i = 2; i <= n; i++) {
//            arr[i] = arr[i-1]+1;
//            if(i % 2 == 0 && arr[i] > arr[i/2] + 1) {
//                arr[i] = arr[i/2] + 1;
//            }
//            if( i % 3 == 0 && arr[i] > arr[i/3] + 1) {
//                arr[i] = arr[i / 3] + 1;
//            }
//        }
//        System.out.println(arr[n]);
//    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        System.out.println(go(n));


    }

    static int go(int n) {
        int arr[] = new int[n+1];
        if(n == 1) return 0;
        if(arr[n] > 0) return arr[n]; // 연산 숫자
        arr[n] = go(n-1) + 1;
        if(n % 2 == 0) {
            int temp = go(n/2)+1;
            if(arr[n] > temp) arr[n] = temp;
        }
        if(n % 3 == 0) {
            int temp = go(n/3) +1;
            if(arr[n] > temp) arr[n] = temp;
        }
        return arr[n];
    }

}
