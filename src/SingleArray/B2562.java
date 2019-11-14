package SingleArray;

import java.util.Scanner;

public class B2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[9];
        int max = 0;
        int maxIndex = 0;
        for(int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
            int j = i+1;
            if(max < arr[i]) {
                max = arr[i];
                maxIndex = j;
            }
        }
        System.out.println(max);
        System.out.println(maxIndex);
    }
}
