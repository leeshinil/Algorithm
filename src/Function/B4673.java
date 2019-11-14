package Function;

public class B4673 {
    public static void main(String[] args) {
        int arr[] = new int[10036];
        for(int i = 0; i < 10000; i++) {
            arr[dn(i)] = 1;
            if(arr[i] != 1) System.out.println(i);
        }
    }
    public static int dn(int i) {
        int res = i;
        if(i >= 10000) {
            res = res + i / 10000;
            i = i %10000;
        }
        if(i >= 1000) {
            res = res + i/1000;
            i = i % 1000;
        }
        if(i >= 100) {
            res = res + i/100;
            i = i % 100;
        }
        if(i >= 10) {
            res = res + i/10;
            i = i % 10;
        }
        return res = res + i;
    }
}
