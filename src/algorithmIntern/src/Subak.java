public class Subak {
    public static void main(String[] args) {
        int n = 4;
        solution(3);

    }

    public static String solution(int n) {
        String answer = "";
        char su = '수';
        char bak = '박';

        for(int i = 0; i < n; i++) {
            if(i%2 ==0) {
                answer += su;
            }
            else answer += bak;
        }


        System.out.println(answer);

        return answer;
    }
}
