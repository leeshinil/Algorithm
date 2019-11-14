package SiliconValleyJobFair;

public class No1 {
    public static void main(String[] args) {
        String test = "happy-birthday";
        int second = 3;
        System.out.println(solution(test, second));

    }

    public static String solution(String phrases, int second) {

        second = second % 28;
        char[] str = phrases.toCharArray();
        char[] answer = {'_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'};
        String ans ="";

        if (second <= 14) {
            System.arraycopy(str, 0, answer, answer.length - second, second);
        } else {
            System.arraycopy(str, second - 14, answer, 0, 28 - second);//14-(sec-14)
        }
        for(int i = 0; i < answer.length; i++) {
            ans += answer[i];
        }
        return ans;

    }
}

