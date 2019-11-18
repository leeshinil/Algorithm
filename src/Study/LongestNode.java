package Study;

import java.util.*;

public class LongestNode {
    public static void main(String[] args) {
        int n = 6;
        int arr[][] = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};
        solution(n, arr);
    }

    public static int solution(int n, int[][] arr) {
        int answer = 0;
        List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        int visit[] = new int[arr.length + 1];
        Arrays.fill(visit, 0);
        //인접리스트 만들
        for (int i = 0; i < arr.length; i++) {
            list.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < arr.length; i++) {
            int a = arr[i][0];
            int b = arr[i][1];
            list.get(a).add(b);
            list.get(b).add(a);
        }
        bfs(visit, list);
        int count = visit[visit.length-1];
        for(int i : visit){
            if(i==count){
                answer++;
            }
        }
        return answer;
    }
    public static void bfs(int[] visit,List<ArrayList<Integer>> list){

        LinkedList<Integer> queue = new LinkedList<>();

        visit[1] = 1;
        queue.add(1);

        while(!queue.isEmpty()){
            int node = queue.poll();

            for(int i : list.get(node)){
                if(visit[i] == 0){
                    visit[i] = visit[node]+1;
                    queue.add(i);
                }
            }
        }
        Arrays.sort(visit);
    }
}

