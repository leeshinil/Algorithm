public class StringNum {
    public static void main(String[] args) {
        String s = "pPoooyY";
        String s2 = "Pyy";
        System.out.println(solution(s));
        System.out.println(solution(s2));
    }

    public static boolean solution(String s) {
        boolean answer = true;
        char p1 = 'p', p2 = 'P', y1 = 'y', y2= 'Y';
        int count1 = 0;
        int count2 = 0;

        for(int i = 0; i <s.length(); i++) {
            if(s.charAt(i) == p1 || s.charAt(i) == p2) count1++;
            else if(s.charAt(i) == y1 || s.charAt(i) == y2) count2++;
        }
        if(count1 == count2) return answer;
        else return false;
    }

}
