package Study;

public class top {
    public static void main(String[] args) {
        int arr[] = {6, 9, 5, 7, 4};
        System.out.println(solution(arr));
    }

    public static int[] solution(int[] heights) {
        int len = heights.length;
        int[] answer = new int[len];

        for (int start = len - 1; start > 0; start--) {
            for (int end = start - 1; end >= 0; end--) {
                if (heights[start] < heights[end]) {
                    answer[start] = (end + 1);
                    break;
                }
                if (end == 0 && heights[start] >= heights[end]) {
                    answer[start] = 0;
                    break;
                }
            }
        }
        answer[0] = 0;
        for (int i = 0; i < heights.length; i++) {

            System.out.println(answer[i]);
        }
        return answer;

    }
}
