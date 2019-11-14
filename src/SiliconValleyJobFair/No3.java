package SiliconValleyJobFair;

public class No3 {
    public static void main(String[] args) {
        int estimates[] = {1, 1, 9, 3, 7, 6, 5, 10};
        int k = 4;
//        int estimates[] = {1,1,5,1,1};
//        int k = 1;
        solution(estimates, k);

    }

    public static int solution(int[] estimates, int k) {
        int sum[] = new int[estimates.length];
        int max = 0;
        int test = 0;
        sum[0] = estimates[0];
        for (int i = 1; i < estimates.length; i++) {
            sum[i] += estimates[i] + sum[i - 1];
        }

        for (int i = k - 1; i < estimates.length; i++) {
            test = 0;
            if (i - k < 0) {
                max = sum[i];
            } else {
                test = sum[i] - sum[i - k];
                max = test > max ? test : max;
            }
        }
        return max;
    }
}
