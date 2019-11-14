package WinterIntern;

public class No1 {
    public static void main(String[] args) {
        int w = 8, h = 12;
//        int w = 3, h = 2;
        solution(w, h);
    }

    public static long solution(int w, int h) {
        long answer = 1;
        double div;
        if (w > h) {
            div = Math.ceil(w / h);
            answer = h * (long) (w - div);
        } else if (w < h) {
            div = Math.ceil(h / w);
            answer = w * (long) (h - div);
        } else if (w == h) {
            div = Math.ceil(h / w);
            answer = w * (long) (h - div);
        }
        return answer;
    }
//    public long solution(int w, int h) {
//        long answer = 1;
//        int gcd = gcd(w, h);
//        double w1 = w / gcd;
//        double h1 = h / gcd;
//
//        double div;
//        if (w1 > h1) {
//            div =Math.ceil(w1/h1);
//
//            answer = h * (long)(w-div);
//        } else if (w1 < h1) {
//            div =Math.ceil(h1/w1);
//
//            answer = w *(long)(h-div);
//        } else if(w1 == h1){
//            div = Math.ceil(h1/w1);
//
//            answer = w * (long)(h-div);
//        }
//        System.out.println(answer);
//        return answer;
//    }
//    public int gcd(int a,int b){
//        if(a % b == 0)
//            return b;
//        return gcd(b,a%b);
//    }

}
