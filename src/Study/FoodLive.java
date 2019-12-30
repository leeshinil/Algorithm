package Study;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class FoodLive {
    public static void main(String[] args) {
        int food_times[] = {3, 1, 2};
        long k = 5;
        System.out.println(solution(food_times, k));
    }

    //    public static int solution(int[] food_times, long k) {
//        long answer = 0;
//        long sum = 0;
//        LinkedList<Integer> key = new LinkedList<>();
//        LinkedList<Integer> value = new LinkedList<>();
//
//        for (int i = 1; i <= food_times.length; i++) {
//            key.add(i);
//            value.add(food_times[i - 1]);
//            sum += food_times[i - 1];
//        }
//
//
//        if (sum <= k) {
//            answer = -1;
//            return (int) answer;
//        }
//
//        int tkey;
//        int tvalue;
//
//        for (long i = 0; i < k; i++) {
//            tkey = 0;
//            tvalue = 0;
//            if (key.size() != 0) {
//                tkey = key.get(0);
//                tvalue = value.get(0);
//            }
//
//            if (key.size() != 0) {
//                key.remove();
//                value.remove();
//            }
//
//            tvalue = tvalue - 1;
//
//            if (tvalue != 0) {
//                key.add(tkey);
//                value.add(tvalue);
//            }
////            System.out.println(" i : " + i + " tkey : " + tkey + " tvalue : " + tvalue);
//        }
//        answer = key.get(0).intValue();
//        return (int) answer;
//    }
    public static int solution(int[] food_times, long k) {
        int answer = 0;

        List<Info> food = new LinkedList<>();
        int size = food_times.length;

        //init
        for (int i = 0; i < size; i++) {
            food.add(new Info(i + 1, food_times[i]));
        }

        //time 순 정렬
        Comparator<Info> cmpTime = new Comparator<Info>() {
            @Override
            public int compare(Info o1, Info o2) {
                return o1.time - o2.time;
            }
        };

        //index 순 정렬: 맨마지막에 다시 돌리기 위함.
        Comparator<Info> cmpIndex = new Comparator<Info>() {
            @Override
            public int compare(Info o1, Info o2) {
                return o1.index - o2.index;
            }
        };

        food.sort(cmpTime);
        int preTime = 0;
        int nowindex = 0;
        for (Info info : food) {
            // 다음거랑 시간 차이.
            long cha2Time = info.time - preTime;
            // 0이면 연산 할 필요가 없음.
            if (cha2Time != 0) {
                long spendTime = cha2Time * size;
                if (spendTime <= k) {
                    k = k - spendTime;
                    preTime = info.time;
                } else {
                    // index 가려내기
                    k = k % size;
                    food.subList(nowindex, food_times.length).sort(cmpIndex);
                    return food.get(nowindex + (int) k).index;
                }
            }
            nowindex++;
            size--;
        }

        return -1;
    }

    public static class Info {
        int index;
        int time;

        public Info(int index, int time) {
            this.index = index;
            this.time = time;
        }
    }
}
