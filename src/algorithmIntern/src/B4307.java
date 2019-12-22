import java.util.Arrays;
import java.util.Scanner;

public class B4307 {
    public static int antLoc[];
    private static int min[];
    private static int max[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int length[] = new int[testCase];
        int antNum[]= new int[testCase];


        for(int i = 0; i < testCase; i++) {
            length[i] = sc.nextInt();
            antNum[i] = sc.nextInt();
            antLoc = new int[antNum[i]];
            min = new int[antNum[i]];
            max = new int[antNum[i]];
            for(int j = 0; j < antNum[i]; j++) {
                antLoc[j] = sc.nextInt();
                if(length[i]  / 2 <  antLoc[j]) {
                    min[j] = antLoc[j];
                    max[j] = length[i] - antLoc[j];
                } else {
                    min[j] = length[i] - antLoc[j];
                    max[j] =antLoc[j];
                }
            }

            Arrays.sort(min);
            Arrays.sort(max);

            System.out.println(max[antNum[i]-1] + " " + min[antNum[i]-1]);

        }
    }
}
