package SiliconValleyJobFair;

public class No2 {
    public static void main(String[] args) {
        int[][] test = {{1, 0, 0, 0}, {0, 0, 0, 1}, {0, 0, 1, 0}, {0, 1, 1, 0}};
        int k = 2;
        solution(test, k);
    }

    public static int solution(int[][] office, int k) {
        int answer = 0;
        int sum = 0;
        for (int i = 0; i <= office.length - k; i++) {
            for (int j = 0; j <= office[0].length - k; j++) {
                sum = 0;
                for (int n = i; n < k; n++) {
                    sum += office[i][j + n] + office[i + n][j] + office[i + n][j + n];
                }
                if (sum > answer) {
                    answer = sum;
                }
                System.out.println("test : " + sum);
            }
        }
        System.out.println(answer);
        return answer;
    }
}


