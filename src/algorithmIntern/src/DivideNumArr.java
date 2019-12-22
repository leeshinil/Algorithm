import java.util.ArrayList;
import java.util.Arrays;

public class DivideNumArr {
    public static void main(String[] args) {
        int arr[] = {5, 9, 7, 10};
        int divisor = 5;
        solution(arr, divisor);
    }

    public static int[] solution(int[] arr, int n) {
        int length = arr.length;
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            if (arr[i] % n == 0) {
                list.add(arr[i]);
            } else {
                count++;
                if (length == count) {
                    list.add(-1);
                }
            }
        }

        int answer[] = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}
