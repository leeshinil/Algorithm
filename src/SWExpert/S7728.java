package SWExpert;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class S7728 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int arr[] = new int[10];


        String a;
        int answer;
        for (int i = 1; i <= num; i++) {
            a = br.readLine();
            answer = 0;
            System.out.print("#"+i+" ");

            for (int z = 0; z < arr.length; z++) {
                arr[z] = 0;
            }

            for (int j = 0; j < a.length(); j++) {
                int n=Character.getNumericValue(a.charAt(j));
                arr[n]++;
            }

            for(int k = 0; k < 10; k++){
                if(arr[k] > 0) {
                    answer++;
                }
            }
            System.out.println(answer);
        }
    }
}
