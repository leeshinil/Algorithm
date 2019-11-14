package SingleArray;

import java.util.Scanner;

public class B4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        double avg = 0;
        int count;
        double answer;
        for(int i = 0; i < num; i++) {
            sum = 0;
            avg = 0;
            count = 0;
            answer = 0;

            int arr[] = new int[sc.nextInt()];

            for(int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
                sum += arr[j];
            }
            avg = sum / arr.length;

            for(int j = 0; j < arr.length; j++) {
                if(avg < arr[j]) count++;
            }

            answer = 100.0 * count / arr.length;
            System.out.printf("%.3f", answer);
            System.out.println("%");
        }
    }
}
