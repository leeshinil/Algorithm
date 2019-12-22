import java.util.Scanner;

public class b2292 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();

        int rslt = 1;
        int roomNum = 1;
        int addNum = 6;
        while (true) {
            if (num <= roomNum) {
                break;
            }
            roomNum += addNum;
            addNum += 6;
            rslt++;
        }
        System.out.println(rslt);
    }
}
