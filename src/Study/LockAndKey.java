package Study;

public class LockAndKey {
    public static void main(String[] args) {
        int key[][] = {{0, 0, 0}, {1, 0, 0}, {0, 1, 1}};
        int lock[][] = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        solution(key, lock);

    }

    public static boolean solution(int[][] key, int[][] lock) {
        boolean answer = true;
        int arr[][] = new int[lock.length * 3][lock.length * 3];
        for(int i = 0; i < lock.length; i++) {
            for(int j = 0; j < lock.length; j++) {
                arr[i + lock.length][j+lock.length] = lock[i][j];
            }
        }

        return answer;
    }
}
