package Line;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class No5 {
    static int n;
    static int m;
    static int x, y;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());

        if (x >= n || y >= m) {
            System.out.println("fail");
        } else {
            System.out.println(minTime());
            System.out.println(getCount());
        }
    }

    static class Point {
        int x;
        int y;
        int count;

        Point(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }


    static int minTime() {
        if (x == 0 && y == 0) return 0;
        Queue<Point> q = new LinkedList<Point>();

        q.add(new Point(0, 0, 0));

        int dx[] = {0, 0, 1, -1};
        int dy[] = {1, -1, 0, 0};

        while (!q.isEmpty()) {
            Point p = q.poll();

            for (int i = 0; i < 4; i++) {
                int move_x = p.x + dx[i];
                int move_y = p.y + dy[i];
                int count = p.count + 1;
                if (move_x >= 0 && move_y >= 0 && move_x < n && move_y < m) {
                    if (move_x == x && move_y == y) return count;
                    q.add(new Point(move_x, move_y, count));
                }
            }
        }
        return 0;
    }

    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    static int getCount() {
        return factorial(x + y) / (factorial(x) * factorial(y));
    }


}