package Naver;

import java.util.Stack;
import java.util.StringTokenizer;

public class No1 {
    public static void main(String[] args) {
//["RECEIVE abcd@naver.com", "RECEIVE zzkn@naver.com", "DELETE", "RECEIVE qwerty@naver.com", "SAVE", "RECEIVE QwerTY@naver.com"]
        String input[] = {"RECEIVE abcd@naver.com", "RECEIVE zzkn@naver.com", "DELETE", "RECEIVE qwerty@naver.com", "SAVE", "RECEIVE QwerTY@naver.com"};
        String input2[] = {"RECEIVE abcd@naver.com", "RECEIVE zzkn@naver.com", "DELETE", "RECEIVE qwerty@naver.com", "SAVE", "SAVE", "DELETE", "RECEIVE QwerTY@naver.com", "SAVE"};
//        System.out.println(solution(input));
        System.out.println(solution(input2));

    }

    public static String[] solution(String[] record) {
//        System.out.println(record.length);
        String[] answer = {};

        Stack<String> tempSave = new Stack<>();
        Stack<String> forSave = new Stack<>();

        for (int i = 0; i < record.length; i++) {
            StringTokenizer st = new StringTokenizer(record[i], ",");
            String one = st.nextToken();

            st = new StringTokenizer(one, " ");
            String type = st.nextToken();
            if (type.equals("RECEIVE")) {
                tempSave.push(st.nextToken());

            } else if (type.equals("DELETE") && !tempSave.isEmpty()) {
                tempSave.pop();

            } else if (type.equals("SAVE")) {
                for (int k = 0; k < tempSave.size(); k++) {
                    forSave.push(tempSave.get(k));
                }
                tempSave.clear();
            }
        }

        answer = new String[forSave.size()];

        for (int i = 0; i < forSave.size(); i++) {
                answer[i] = forSave.get(i);
                System.out.println(answer[i]);
            }

        return answer;
    }

}