public class muhau {

    /*number 1*/
//    public static void main(String[] args) {
//        System.out.println(test("hello my name is lee shinil"));
//        System.out.println(test("null"));
//        System.out.println(test(""));
//
//    }
//
//    public static String test(String phrase) {
//        if (phrase == null || phrase.isEmpty()) return null;
//
//        else {
//            String[] arr = phrase.split(" ");
//            System.out.println(arr[0]);
//            StringBuffer sb = new StringBuffer();
//
//            for (int i = 0; i < arr.length; i++) {
//                sb.append(Character.toUpperCase(arr[i].charAt(0))).append(arr[i].substring(1)).append(" ");
//                System.out.println(sb);
//            }
//            System.out.println("here" + sb);
//
//            return sb.toString();
//        }
//    }
    /*number 2*/
//    public static void main(String[] args) {
//        System.out.println("a");
//        System.out.println("hi");
//        System.out.println(test("hello"));
//    }
//    public static String test(String str) {
//        int len = str.length();
//        String result = "";
//        if (len % 2 == 1) {
//            char c = str.charAt(len/2);
//            result += c;
//        } else {
//            result += (str.charAt(len/2-1) + "" + str.charAt(len/2));
//        }
//        return result;
//
//    }

    /*number 3*/
//    public static void main(String[] args) {
//        System.out.println(test(10));
//        System.out.println(test(100));
//    }
//    public static int test(int number) {
//        int sum = 0;
//        for (int i = 0; i < number; i ++) {
//            if (i % 3 == 0 || i % 5 == 0) {
//                sum += i;
//            }
//        }
//        return sum;
//    }


    /*number 4*/
//    public static void main(String[] args) {
//        System.out.println(test("100 201 432 134 4000"));
//    }
//
//    public static String test(String string) {
//
//        List<String> s = Arrays.asList(string.split(" "));
//        System.out.println(s); //리스트
//
//        Collections.sort(s, new Comparator<String>() {
//            public int compare(String o1, String o2) {
//                int diff = getSum(o1) - getSum(o2);
//                System.out.println(diff);
//
//                return diff == 0 ? o1.compareTo(o2) : diff < 0 ? -1 : 1;
//            }
//
//        });
//        System.out.println( "here      " +s);
//        return String.join( " " , s);
//    }
//
//    private static int getSum(String s) {
//        int sum = 0;
//        for (String d : s.split("")) {
//            sum += Integer.parseInt(d);
//        }
//        return sum;
//
//    }

    /*number 6*/
    static int top;
    static char stack[];
    static int MAX_N;

    public static void main(String[] args) {
        System.out.println(test("(({}))"));
    }

    static void stackInit() {
        top = 0;
    }

    static boolean stackIsEmpty() {
        return (top == 0);
    }

    static boolean stackIsFull() {
        return (top == MAX_N);
    }

    static boolean stackPush(char value) {
        if (stackIsFull()) {
            return false;
        }
        stack[top] = value;
        top++;

        return true;
    }

    static char stackPop() {
        top--;
        char value = stack[top];
        return value;
    }

    public static boolean isCheck(String input, int size) {
        for (int i = 0; i < size; i++) {
            char c = input.charAt(i);
            if (c == '(' || c == '[' || c == '{' || c == '<') {
                if (!stackPush(c))
                    return false;

            } else {
                if (stackIsEmpty())
                    return false;
                char popChar = stackPop();
                if (popChar == '(' && c != ')')
                    return false;
                else if (popChar == '[' && c != ']')
                    return false;
                else if (popChar == '{' && c != '}')
                    return false;
                else if (popChar == '<' && c != '>')
                    return false;
            }
        }
        return true;
    }

    public static boolean test(String braces) {
        int size = braces.length();
        MAX_N = size / 2 + 1;
        stack = new char[MAX_N];
        top = 0;
        String input = braces;
        return isCheck(input, size);
    }
}
