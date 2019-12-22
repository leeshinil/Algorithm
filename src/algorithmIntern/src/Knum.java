import java.util.Arrays;

public class Knum {

    public static void main(String[] args) {
        int array[] = {1, 5, 2, 6, 3, 7, 4};
        int commands[][] = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        solution(array, commands);
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int index = 0;
        for (int i = 0; i < commands.length; i++) {
            int s = commands[i][0];
            int l = commands[i][1];
            int k = commands[i][2];

            int tmp[] = new int[(l - s) + 1];
            int a = 0;
            for (int j = s - 1; j < l; j++) {
                tmp[a] = array[j];
                a++;
            }
            Arrays.sort(tmp);
            answer[index] = tmp[k - 1];
            System.out.println("test : " + answer[index]);
            index++;

        }
        return answer;
    }
}
