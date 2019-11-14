package WinterIntern;

import java.util.Stack;

public class No3 {
    static boolean visited[][] = null;
    static int gresult = Integer.MAX_VALUE;
    static int gheight = 0;
    static int N = 0;

    public static void main(String[] args) {
        int land[][] = {{1, 4, 8, 10}, {5, 5, 5, 5}, {10, 10, 10, 10}, {10, 10, 10, 20}};
        int height = 3;
        System.out.println(solution(land, height));
        return;
    }


    public static int solution(int[][] land, int height) {
        int answer = 0;

        N = land.length;
        gheight = height;
        visited = new boolean[N][N];

        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                visited = new boolean[N][N];
                dfs(land, visited, i,j,0,1);
            }
        }

        answer = gresult;
        return answer;
    }

    public static void dfs(int land[][], boolean visited[][], int ncol, int nrow, int result, int cnt) {
        int dc[] = {0,0,1,-1};
        int dr[] = {1,-1,0,0};
        if(visited[ncol][nrow]) return;
        visited[ncol][nrow] = true;

        if(cnt == (N*N)) {
            gresult = Math.min(gresult, result);
        }

        for(int i=0;i<4;i++) {
            int pcol = ncol + dc[i];
            int prow = nrow + dr[i];
            if(pcol > -1 && pcol < N && prow > -1 && prow < N) {
                if(!visited[pcol][prow]) {
                    int cha2 = Math.abs((land[ncol][nrow] - land[pcol][prow]));
                    if(cha2 > gheight) {
                        dfs(land,visited,pcol,prow,result+cha2,cnt+1);
                    }
                    else {
                        dfs(land,visited,pcol,prow,result,cnt+1);
                    }

                }
            }
        }

    }

}
