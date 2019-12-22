import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2748 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());

        System.out.println(fibonacci(num));

    }
    public static int fibonacci(int number) {
        if(number <= 1)
            return number;
        else
            return fibonacci(number - 2) + fibonacci(number - 1);
    }
}

/*
* import java.util.Scanner;

public class Beak2748 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] list = new long[n+1];

        list[0] = 0;
        list[1] = 1;

        for(int i=2;i<list.length;i++) {
            list[i] = list[i-2] + list[i-1];
         }
        System.out.println(list[n]);
    }
}
*/
