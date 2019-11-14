package Dynamic;

import java.util.Scanner;

public class B1463 {
    /*top -> bottom*/
//    public static int arr[];
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        arr = new int[num+1];
//        System.out.println(solution(num));
//    }
//    public static int solution(int num) {
//        if(num == 1) return 0;
//        if(arr[num] > 0) return arr[num];
//        arr[num] = solution(num-1) +1;
//        if(num % 2 == 0) {
//            int tmp = solution(num/2) + 1;
//            if(tmp < arr[num]) arr[num] = tmp;
//        }
//        if(num %3 ==0) {
//            int tmp = solution(num/3) + 1;
//            if(tmp < arr[num]) arr[num] = tmp;
//        }
//        return arr[num];
//    }
    /*bottom -> up*/
//    public static void main(String[] args) {
//        Scanner sc  = new Scanner(System.in);
//        int num = sc.nextInt();
//        int arr[] = new int[num + 1];
//        arr[1] = 0;
//        for(int i = 2; i <= num; i++) {
//            arr[i] = arr[i-1] +1;
//            if(i % 2 == 0 && arr[i] > arr[i/2]+1) {
//                arr[i] = arr[i/2]+1;
//            }
//            if(i%3 == 0 && arr[i] > arr[i/3] + 1) {
//                arr[i] = arr[i/3] + 1;
//            }
//        }
//        System.out.println(arr[num]);
//    }
}
