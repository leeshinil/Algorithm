package SingleArray;

import java.util.Scanner;

public class B8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result[] = new int[num];
        String tmp;
        int score;

        sc.nextLine();

        for (int i = 0; i < num; i++) {
            tmp = sc.nextLine();
            score = 0;

            for (int j = 0; j < tmp.length(); j++) {
                if (tmp.charAt(j) == 'O') {
                    score++;
                    result[i] += score;
                } else {
                    score = 0;
                }
            }

        }
        for (int i = 0; i < num; i++) {
            System.out.println(result[i]);
        }
    }
}
