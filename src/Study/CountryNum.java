package Study;

public class CountryNum {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(solution(n));
    }
    public static String solution(int n) {
        //StringBuilder사용해보기
        String answer = "";
        int rmd;

        while(n>0){
            rmd = n%3;
            n = n/3;

            if(rmd == 0){
                n -= 1;
                rmd = 4;
            }

            answer = rmd + answer;
        }

        return answer;
    }
}