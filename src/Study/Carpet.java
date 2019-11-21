package Study;

public class Carpet {
    public static void main(String[] args) {
        int brown = 8;
        int red = 1;
        solution(brown, red);
    }
    public static int[] solution(int brown, int red) {
        int answer[] = new int[2];

        for(int i = 1; i <= red; i++) {
            if(red % i == 0 && (2 * i) + (2 * (red / i)) + 4 == brown) {
//                System.out.println(i);
                int a = red / i + 2;
                int b = i+2;
                if((a - 2) * (b - 2) == red && a >= b){
                    answer[0] = a;
                    answer[1] = b;
                }
                System.out.println("a : " + a + " b : " + b);

            }
        }
        System.out.println(answer[0] + " " + answer[1]);
        return answer;
//        answer[1] = (int)Math.sqrt(total);
//        answer[0] = (int)total / answer[1];
    }
}
