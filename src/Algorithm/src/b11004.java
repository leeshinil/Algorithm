import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b11004 {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int n;
//        int k;
//        n = sc.nextInt();
//        k = sc.nextInt();
//        int arr[] = new int[n + 1];
//        for (int i = 1; i < n + 1; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int size = arr.length;
//        for(int i = size-1; i > 1; i--) {
//            for(int j = 1; j < i; j++) {
//                if(arr[j] > arr[j+1]) {
//                    swap(arr,j,j+1);
//                }
//            }
//        }
//        System.out.println(arr[k]);
//    }
//    public static void swap(int arr[], int f, int s) {
//        int tmp = arr[f];
//        arr[f] = arr[s];
//        arr[s] = tmp;

        //scanner 시간초괴
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");

        // 정렬 할 수들을 입력 받음
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        br.close();

        // 숫자들을 정렬
        Arrays.sort(arr);

        // 결과 값을 출력
        System.out.println(arr[K - 1]);




    }
}
