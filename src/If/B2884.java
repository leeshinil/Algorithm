package If;

import java.util.Scanner;

public class B2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();

        if (hour < 0 || hour > 24) hour = sc.nextInt();
        if (min < 0 || min > 60) min = sc.nextInt();

        min -= 45;
        if (min < 0) {
            hour -= 1;
            if (hour < 0) {
                hour = hour + 24;
            }
            min = min + 60;
        }
        System.out.println(hour + " " + min);
    }
}
