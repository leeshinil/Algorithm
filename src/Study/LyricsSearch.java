package Study;

import java.util.Arrays;

public class LyricsSearch {
    public static void main(String[] args) {
        String word[] = {"frodo", "front", "frost", "frozen", "frame", "kakao"};
        String queries[] = {"fro??", "????o", "fr???", "fro???", "pro?"};
        solution(word, queries);
    }

    public static int[] solution(String[] words, String[] queries) {
        int[] answer = new int[queries.length];
        //초기화
        Arrays.fill(answer, 0);
        Arrays.sort(words);
        Arrays.sort(queries);
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);

        }
        for (int i = 0; i < queries.length; i++) {
            System.out.println(queries[i]);
        }

        //이분탐색

        return answer;
    }
}
