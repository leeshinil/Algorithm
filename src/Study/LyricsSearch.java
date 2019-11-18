package Study;

public class LyricsSearch {
    public static void main(String[] args) {
        String word[] = {"frodo", "front", "frost", "frozen", "frame", "kakao"};
        String queries[] = {"fro??", "????o", "fr???", "fro???", "pro?"};
        solution(word, queries);
    }
    public static int[] solution(String[] words, String[] queries) {
        int[] answer = new int[queries.length];
        //초기화
        for(int i = 0; i < answer.length; i++) {
            answer[i] = 0;
        }


        return answer;
    }
}
