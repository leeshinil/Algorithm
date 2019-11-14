package SWExpert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class S8104 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int num = Integer.parseInt(br.readLine());
//        StringTokenizer st;
//        StringBuilder sb;
//
//        int n; //한 반의 수
//        int k; //반 수
//        int sum;
//        for(int i = 1; i <= num; i++) {
//            sum = 0;
//            sb = new StringBuilder();
//            st = new StringTokenizer(br.readLine(), " ");
//            n = Integer.parseInt(st.nextToken());
//            k = Integer.parseInt(st.nextToken());
//            if(n == 1) {
//                sb.append("#" + i);
//                for(int j = 1; j <= k; j++) {
//                    sb.append(" " + j);
//                }
//            } else {
//                for (int j = 1; j <= n * k; j++) {
//                    sum += j;
//                }
//                sb.append("#" + i);
//                for (int z = 0; z < k; z++) {
//                    sb.append(" " + sum / k);
//                }
//            }
//            System.out.println(sb);
//        }
//
//    }
//}
import java.util.Scanner;

public class S8104 {
    public static void main(String args[])
    {
        Scanner std = new Scanner(System.in);
        int T= std.nextInt();

        for(int i=1; i<=T; i++)
        {
            int N= std.nextInt();
            int K= std.nextInt();
            int[] sum= new int[K];
            int cnt=1;
            System.out.print("#"+i+" ");
            for(int j=0;j<N; j++)
            {
                if(j%2==0)
                {
                    for(int k=0; k<K; k++)
                        sum[k]+=cnt++;
                }
                else
                {
                    for(int k=K-1; k>=0; k--)
                        sum[k]+=cnt++;
                }
            }
            for(int l=0; l<K; l++)
                System.out.print(sum[l]+" ");
            System.out.println();
        }
    }
}
