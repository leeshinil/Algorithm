package Study;

import java.util.Arrays;
import java.util.Comparator;

public class IntermittentCamera {
    public static void main(String[] args) {
        int routes[][] = {{-20,15}, {-14,-5}, {-18,-13}, {-5,-3}};
        solution(routes);
    }

    public static int solution(int[][] routes) {
        int answer = 0;

        Arrays.sort(routes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[1], o2[1]);
            }
        });

        int end = routes[0][0]-1;

        for(int i = 0; i < routes.length; i++) {
            if(end < routes[i][0] ) {
                answer++;
                end = routes[i][1];
            }
        }
        return answer;
    }

}


