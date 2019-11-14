package KakaoIntern;

import java.util.Stack;

public class No1 {
    public static void main(String[] args) {
        int board[][] = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int moves[] = {1,5,3,5,1,2,1,4};
        solution(board, moves);
    }
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack= new Stack<>();

        for(int i = 0; i < moves.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[j][moves[i]-1] != 0) {
                    stack.push(board[j][moves[i] - 1]);
                    board[j][moves[i]-1] = 0;
                    break;
                }
            }
        }
        for(int i = 0; i < stack.size() -1; i++) {
            if(stack.get(i) == stack.get(i+1)) {

                stack.remove(i);
                stack.remove(i);

                i -= 2;
                if(i == -2) {
                    i = -1;
                }
                answer += 2;

            }

        }
        System.out.println(answer);
        return answer;
    }
}
