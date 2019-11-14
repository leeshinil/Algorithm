package Ict;

import java.io.*;

public class No2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        float a = Float.parseFloat(bufferedReader.readLine().trim());

        float b = Float.parseFloat(bufferedReader.readLine().trim());

        int result = addNumbers(a, b);



        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
    public static int addNumbers(float a, float b) {
        int sum = 0;
        sum = (int) (a+b);

        return sum;
    }
}