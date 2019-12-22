import java.util.Arrays;
import java.util.Scanner;

public class B2805 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(solution(m, arr));

    }
    public static int solution(int m, int arr[]) {
        int min = 0;
        int max = arr[arr.length-1];
        int mid;
        while(min <= max) {
            int cut;
            long result =0;
            mid = (max + min) /2;
            for(int i = 0; i < arr.length; i++) {
                 cut = arr[i]-mid;
                 if(cut<0) {
                     cut = 0;
                 }
                 result += cut;
            }
            if(result >= m) min = mid +1;
            else if(result < m) max = mid -1;
        }
        return max;
    }
}
