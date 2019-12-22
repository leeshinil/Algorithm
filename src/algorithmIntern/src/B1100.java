import java.util.Scanner;

public class B1100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        char arr[][] = new char[8][8];
        for(int i = 0; i < 8; i++) {
            String line = sc.nextLine();
            for(int j = 0; j < 8; j++) {
                arr[i][j] = line.charAt(j);
                if(arr[i][j] == 'F' && (i+j) % 2 == 0) count++;
            }
        }
        System.out.println(count);
    }
}
