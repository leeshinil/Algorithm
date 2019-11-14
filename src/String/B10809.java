package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10809 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int arr[] = new int[26];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        int change;

        for(int i = 0; i < input.length(); i++) {
            change  = input.indexOf(input.charAt(i));
            arr[input.charAt(i) - 97] = change;
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.print((i != arr.length-1) ? arr[i] + " " : arr[i]);
        }
    }
}
