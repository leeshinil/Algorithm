package String;

import java.util.Scanner;

public class B1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int answer = n;

        for (int i = 0; i < n; i++) {
            String word = sc.next();
            boolean check[] = new boolean[26];

            for(int j = 1; j < word.length(); j++) {
                if(word.charAt(j-1) != word.charAt(j)) {
                    if(check[word.charAt(j)-97] == true) {
                        answer--;
                        break;
                    }
                    check[word.charAt(j-1) -97] = true;
                }
            }
        }
        System.out.println(answer);
    }
}
