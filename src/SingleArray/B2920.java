package SingleArray;

import java.util.Scanner;

public class B2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[8];
        String answer = "";
        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 7; i++) {
            if (arr[i] == arr[i + 1] - 1) answer = "ascending";
            else if (arr[i] == arr[i + 1] + 1) answer = "descending";
            else {
                answer = "mixed";
                break;
            }
        }
        System.out.println(answer);
    }
}
