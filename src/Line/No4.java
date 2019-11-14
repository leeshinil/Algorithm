package Line;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No4 {

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int arr[] = new int[n];
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int length = 0;
        int start = 0;
        int end = 0;
        int sit[] = new int [n+start+end];
        int x=0;
        int max=0;
        int answer;

        if (arr[0] == 0) {
            for (int i = 0; i < n; i++) {
                if(arr[i]==0) {
                    start++;
                }
                else break;
            }
        }

        if(arr[n-1]==0) {
            for(int i=n-1; n>i;i--) {
                if(arr[i]==0) {
                    end++;
                }
                else break;
            }
        }

        for(int i=start; i<sit.length-end ; i++) {
            sit[i]=arr[x];
            x++;
        }

        for(int i=0; i<sit.length; i++) {
            if(sit[i]==1) {
                length=0;
            }
            else {
                length ++;
                if(length > max) {
                    max = length;
                }
            }
        }

        if(max%2==0) {
            answer = (int) ((max/2)-1)+1;
        }
        else {
            answer = (int) Math.floor(max/2)+1;
        }
        System.out.println(answer);
    }
}