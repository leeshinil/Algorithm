import java.util.Scanner;

public class DFSTest {
    static int[][] map; //map을 나타내는 배열
    static int[][] visited;
    static int map_size; //map의 Size
    static int min;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        map_size = Integer.parseInt(scan.nextLine().trim()); //map의 size를 입력받는다.
        map = new int[map_size+1][map_size+1]; //map의 배열의 크기를 입력받은 map_size크기로 만든다.
        min = map_size * map_size;
        //이동할 수 있는 path를 입력받기 위해 for문을 사용.
        for(int i = 0; i < map_size; i++) {
            for(int j = 0; j < map_size; j++) {
                map[i][j] = scan.nextInt();
            }
        }

        dfs(0,0,1);

        System.out.println("최단 거리 : " + min);
    }

    //dfs알고리즘 시작
    public static void dfs(int x, int y, int length) {

        if(x == map_size -1 && y == map_size -1){
            if (min > length) min = length;
            return;
        }

        map[y][x] = 0;

        //왼쪽으로 이동할 경우
        if(x > 0 && map[y][x-1] == 1) {
            dfs(x-1, y, length+1);
        }

        //오른쪽으로 이동할 경우
        if(x < map_size && map[y][x+1] == 1) {
            dfs(x+1, y, length+1);
        }
        //아래로 이동할 경우
        if(y < map_size && map[y+1][x] == 1) {
            dfs(x, y+1, length+1);
        }
        //위로 이동할 경우
        if(y > 0 && map[y-1][x] == 1) {
            dfs(x, y-1, length+1);
        }

        map[y][x] = 1;
    }
}