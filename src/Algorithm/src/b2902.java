import java.util.Scanner;

public class b2902 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(test(str));


    }

    public static String test(String phrase) {
        if (phrase == null || phrase.isEmpty()) return null;

        else {
            String[] arr = phrase.split("-");
            StringBuffer sb = new StringBuffer();

            for (int i = 0; i < arr.length; i++) {
                sb.append(Character.toUpperCase(arr[i].charAt(0)));
            }

            return sb.toString();
        }
    }
}