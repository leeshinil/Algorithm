import java.util.ArrayList;

public class NotSameNum {
    public static void main(String[] args) {
        int arr[] = {1,1,3,3,0,1,1};
        solution(arr);
    }
    public static int[] solution(int[] arr){

        ArrayList<Integer> tempList = new ArrayList<Integer>();
        int preNum = 10;
        for(int num : arr) {
            if(preNum != num)
                tempList.add(num);
            preNum = num;
        }
        int[] answer = new int[tempList.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = tempList.get(i).intValue();
        }
        return answer;
    }
}
