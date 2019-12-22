public class kakao3 {
    public static void main(String[] args) {
        int n = 3;
        int arr[] = {4,2,2,5,3};
        int result[] = new int[arr.length];
        int i =0;
        do{
            if(i < n) {
                result[i] = arr[i];
                i++;
                System.out.println(result[i]);
                for(int j = 0; j < n; j++) {
                    result[j]--;
                    if(result[j] == 0){
                        n++;
                    }
                }

            }
        }while(i == arr.length);
        for(int k = 0; k < result.length; k++) {
            System.out.println(result[k]);
        }
    }
}
