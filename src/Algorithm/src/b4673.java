public class b4673 {
    public static void main(String[] args) {
        int arr[] = new int[100000];

        for(int i = 1; i < 10000; i++) {

            arr[test(i)] = 1;
            if(arr[i] != 1) {
                System.out.println(i);
            }
        }
    }

    static int test(int a) {
        return a + a / 1000 + ((a %1000) / 100) + ((a % 1000) % 100 )/10 + a % 10;
    }
}
