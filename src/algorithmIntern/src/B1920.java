import java.util.Arrays;
import java.util.Scanner;

public class B1920 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int arr1[] = new int[n];
        Init(n,arr1);

        int m = sc.nextInt();
        int arr2[] = new int[m];
        Init(m,arr2);
        Arrays.sort(arr1);


        for(int i = 0; i < m; i++) {
            System.out.println(binSearch(n, arr2[i], arr1));
        }
    }
    public static int[] Init(int a , int arr[]) {
        for(int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static int binSearch(int n, int s, int arr[]) {
        int max = n;
        int min = -1;
        int answer = 0;
        while (max - min > 1) {
            int mid = (min + max) /2;
            if(s == arr[mid]) {answer = 1;break;}
            else if(s > arr[mid]) min = mid;
            else if(s < arr[mid]) max = mid;
        } return answer;
    }
}
