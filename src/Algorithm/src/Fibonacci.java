public class Fibonacci {
    static int[] arr = new int[100];

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            arr[i] = fibonacci(i);
            System.out.println(arr[i]);
        }

    }

    static int fibonacci(int i) {
        if(i <= 1) return i;

        else {
            if(arr[i] > 0) return arr[i];
            arr[i] = arr[i-1] + arr[i-2];

            return arr[i];
        }
    }
}
