import java.util.Arrays;
import java.util.Scanner;

public class B11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 사람수
        int time[] = new int[n+1];

        for (int i = 1; i < n+1; i++) {
            time[i] = sc.nextInt();
        }

        Arrays.sort(time);

        int sum = 0;

        for(int i = 1; i < n+1; i++) {
            time[i] = time[i-1] + time[i];
            sum += time[i];
        }


        System.out.println(sum);

    }

}
