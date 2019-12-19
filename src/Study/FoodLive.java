package Study;

import java.util.LinkedList;

public class FoodLive {
    public static void main(String[] args) {
        int food_times[] = {3, 1, 2};
        long k = 5;
        System.out.println(solution(food_times, k));
    }

    public static int solution(int[] food_times, long k) {
        long answer = 0;
        long sum = 0;
        LinkedList<Integer> key = new LinkedList<>();
        LinkedList<Integer> value = new LinkedList<>();

        for (int i = 1; i <= food_times.length; i++) {
            key.add(i);
            value.add(food_times[i - 1]);
            sum += food_times[i - 1];
        }


        if (sum <= k) {
            answer = -1;
            return (int) answer;
        }

        int tkey;
        int tvalue;

        for (long i = 0; i < k; i++) {
            tkey = 0;
            tvalue = 0;
            if (key.size() != 0) {
                tkey = key.get(0);
                tvalue = value.get(0);
            }

            if (key.size() != 0) {
                key.remove();
                value.remove();
            }

            tvalue = tvalue - 1;

            if (tvalue != 0) {
                key.add(tkey);
                value.add(tvalue);
            }
//            System.out.println(" i : " + i + " tkey : " + tkey + " tvalue : " + tvalue);
        }
        answer = key.get(0).intValue();
        return (int) answer;
    }
}
