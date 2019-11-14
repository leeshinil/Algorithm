package SingleArray;

import java.util.Arrays;
import java.util.Scanner;

public class B3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int answer = 1;
        int divAnswer[] = new int[10];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            divAnswer[i] = arr[i] % 42;
        }
        Arrays.sort(divAnswer);
        for(int i = 0; i < divAnswer.length -1; i++) {
            if(divAnswer[i] != divAnswer[i+1]) answer++;
        }
        System.out.println(answer);

    }
}
