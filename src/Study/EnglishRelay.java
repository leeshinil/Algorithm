package Study;

import java.util.ArrayList;
import java.util.Scanner;

public class EnglishRelay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] a = new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        String[] b = new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
        String[] d = new String[]{"hello", "one", "even", "never", "now", "world", "draw"};
        int z[] = solution(num, a);
        System.out.println(z[0] + " " + z[1]);
    }

    public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        ArrayList<String> check = new ArrayList<>();
        check.add(words[0]);
        for (int i = 0; i < words.length - 1; i++) {

            String last = words[i].substring(words[i].length() - 1, words[i].length());
            String first = words[i + 1].substring(0, 1);

            if (!last.equals(first) || check.contains(words[i + 1])) {
                if ((i + 2) % n == 0) {
                    answer[0] = n;
                    answer[1] = (i + 2) / n;
                    return answer;
                } else {
                    answer[0] = (i + 2) % n;
                    answer[1] = ((i + 2) / n) + 1;
                    return answer;
                }

            } else {
                check.add(words[i + 1]);
                answer[0] = 0;
                answer[1] = 0;
            }
        }
        return answer;

    }
}
