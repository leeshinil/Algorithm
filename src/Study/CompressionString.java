package Study;

public class CompressionString {
    public static void main(String args[]) {
        String s = "aabbaccc";
        String s1 = "ababcdcdababcdcd";
        String s2 = "abcabcdede";
        String s3 = "xababcdcdababcdcd";
        String s4 = "abcabcabcabcdededededede";
        String s5 = "a";
        solution(s5);

    }

//    public static int solution(String s) {
//        int answer = 0;
//        String check[] = new String[s.length() + 1];
//        StringBuilder result = new StringBuilder();
//        String temp;
//
//        int sameCheck;
//        int tempLength = s.length();
//        int j;
//        int k;
//        for (int i = 1; i <= s.length() / 2; i++) {
//            sameCheck = 1;
//            result.delete(0, result.length());
//            if (s.length() % i == 0) {
//                for (j = 1; j <= s.length() / i; j++) {
//                    check[j] = s.substring((j - 1) * i, j * i);
////                    System.out.println("same : " + i + " " + j + " " + check[j]);
//                }
////                System.out.println("same : " + j);
//            } else {
//                for (j = 1; j <= s.length() / i; j++) {
//                    check[j] = s.substring((j - 1) * i, j * i);
//                }
//                check[j + 1] = s.substring((j - 1) * i);
//
////                for (j = 1; j <= s.length() / i; j++) {
////                    System.out.println("dif  : " + i + " " + check[j]);
////                }
////                System.out.println("dif  : " + i + " " + check[j + 1]);
////                System.out.println("dif " + j);
//            }
//
//            temp = check[1];
//
//            for (k = 2; k <= s.length() / i; k++) {
//                if (temp.equals(check[k])) {
//                    sameCheck++;
//                    if (sameCheck > 2) {
//                        result.deleteCharAt(result.length() - 1);
//                    }
//                    result.append(sameCheck);
//                    temp = check[k];
//                } else {
//                    result.append(temp);
//                    temp = check[k];
//                    sameCheck = 1;
//                }
//            }
//            result.append(temp);
//
//            if (s.length() % i != 0) {
//                result.append(check[k + 1]);
//            }
//
//            answer = result.length();
//            if (tempLength >= answer) {
//                tempLength = answer;
//            } else {
//                answer = tempLength;
//            }
////            System.out.println(result);
////            System.out.println(answer);
//        }
//
//        if(s.length() ==1 ) {
//            answer = 1;
//        }
//        System.out.println(answer);
//        return answer;
//
//    }
    public static int solution(String s) {
        String exStr = s;
        String bufStr = "";
        String resultStr = "";
        int bufCount = 1;
        int resultLen = exStr.length();
        int resultCount = resultLen;

        for(int i = 1 ; i <= exStr.length()/2; i++) {
            for(int j = 1 ; j <= exStr.length()/i; j++) {
                if(bufStr.equals(exStr.substring((j-1)*i , j*i))) {
                    bufCount++;
                }else {
                    if(bufCount != 1) {
                        resultStr += Integer.toString(bufCount);
                        bufCount = 1;
                    }
                    resultStr += exStr.substring((j-1)*i , j*i);
                }
                bufStr = exStr.substring((j-1)*i , j*i);
            }
            if(bufCount != 1) {
                resultStr += Integer.toString(bufCount);
                bufCount = 1;
            }
            if(resultLen % i != 0)
                resultStr += exStr.substring( resultLen - resultLen % i,resultLen);
            if(resultStr.length() < resultCount) {
                resultCount = resultStr.length();
            }
            resultStr = "";
        }
        System.out.println(resultCount);
        return resultCount;
    }
}
