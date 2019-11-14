package WinterIntern;

import java.util.LinkedList;

public class No2 {

    public static void main(String[] args) {

    }

    class Solution {
        public int[] solution(int n) {
            int[] answer = {};
            LinkedList<Integer> linkedList = new LinkedList<>();
            int[] s = new int[n];

            s[0] = 1;

            if (n == 1) {
                answer = new int[s[0]];
                answer[0] = 0;
                return answer;
            }
            else {
                linkedList.add(0);
                for (int i = 1; i < n; i++) {
                    s[i] = (s[i - 1] * 2) + 1;
                    answer = new int[s[i]];
                    boolean check = true;
                    for (int j = 0; j < answer.length; j++) {
                        if (j % 2 == 0) {
                            if (check) {
                                answer[j] = 0;
                                check = false;
                            } else {
                                answer[j] = 1;
                                check = true;
                            }
                        } else
                            answer[j] = linkedList.poll();
                    }
                    for (int j = 0; j < answer.length; j++)
                        linkedList.add(answer[j]);
                }
            }
            return answer;
        }
    }
}
