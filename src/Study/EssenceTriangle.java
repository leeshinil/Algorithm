package Study;

import java.util.Arrays;

public class EssenceTriangle {
    public static void main(String[] args) {
        int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        //0,0
        //1,0 1,1
        //2,0 2,1 2,2
        //3,0 3,1 3,2 3,3

        solution(triangle);
    }
    public static int solution(int[][] triangle) {
        int answer = 0;
//        System.out.println(triangle[0][0]);
        for(int i = 1; i < triangle.length; i++) {
            for(int j = 0; j <=i; j++) {
                if(j == 0) {
                    triangle[i][j] += triangle[i-1][j];
                } else if(j == i) {
                    triangle[i][j] += triangle[i - 1][j - 1];
                }
                else {
                    triangle[i][j] += Math.max(triangle[i-1][j], triangle[i-1][j-1]);
                }
//                System.out.print(triangle[i][j] + " ");
            }
//            System.out.println();
        }
        Arrays.sort(triangle[triangle.length-1]);
        answer = triangle[triangle.length-1][triangle.length-1];
//        System.out.println(triangle[triangle.length-1][triangle.length-1]);
        return answer;
    }
}
