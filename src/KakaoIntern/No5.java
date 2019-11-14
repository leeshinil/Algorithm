package KakaoIntern;

public class No5 {
    public static void main(String[] args) {
        int[] stones = {2, 4, 5, 3, 2, 1, 4, 2, 5, 1};
        int k = 3;
        solution(stones, k);
    }

    public static int solution(int[] stones, int k) {
        int answer = 0;

        boolean check = false;
        do {
            int count = 1;
            for (int i = 0; i < stones.length; i++) {
                if (stones[i] != 0) {
                    stones[i]--;
                    count = 1;
                } else {
                    count++;
                    if (count > k) {
                        check = true;
                        break;
                    }
                }
            }
            if (!check) {
                answer++;
            }
        } while (!check);
        System.out.println(answer);
        return answer;
    }
}
