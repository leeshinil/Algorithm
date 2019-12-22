import java.util.Scanner;

public class b10817 {
    public static void main(String args[]) {
        int arr[] = new int[3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            arr[i] = sc.nextInt();
        }
        if(arr[0] >= arr[1] && arr[1] >= arr[2] || arr[2] >= arr[1] && arr[1] >=arr[0]) {
            System.out.println(arr[1]);
        }
        else if(arr[0] >= arr[2] && arr[2] >= arr[1] || arr[1] >= arr[2] && arr[2] >= arr[0]) {
            System.out.println(arr[2]);
        }
        else
            System.out.println(arr[0]);

    }
}