package Study;

import java.util.Arrays;

public class Budget {
    public static void main(String[] args) {
        int arr[] = {120, 110, 140, 150};
        int M = 485;
        solution(arr, M);
    }
    public static int solution(int[] budgets, long M) {
        int answer = 0;
        Arrays.sort(budgets);

        int mid = 0;
        long sum = 0;
        int first = 0;
        int last = budgets[budgets.length - 1];

        for (int i = 0; i < budgets.length; i++) {
            sum += budgets[i];
        }

        if (sum < M) {
            return last;
        } else {
            while (true) {
                sum = 0;
                mid = (first + last) / 2;
                for (int i = 0; i < budgets.length; i++) {
                    if (budgets[i] > mid) {
                        sum += mid;
                    } else {
                        sum += budgets[i];
                    }
                }

                if (first > last)
                    break;

                if (sum > M) {
                    last = mid - 1;
                }
                else {
                    if (mid >= answer) {
                        answer = mid;
                    }
                    first = mid + 1;
                }
                // System.out.println("first : " + first + " last : " + last + " answer : " + answer);
            }

        }
        return answer;
    }
}
