package String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2941 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine().trim();
        int result = 0;
        int length = input.length();

        int i;
        for(i=0; i<length; i++) {
            result++;
            switch(input.charAt(i)) {
                case 'c':
                    if(i < length-1 && (input.charAt(i+1)=='=' || input.charAt(i+1)=='-')) {
                        i++;
                    }
                    break;
                case 'd':
                    if(i < length-2 && input.charAt(i+1)=='z' && input.charAt(i+2)=='=') {
                        i+=2;
                    }else if(i < length-1 && input.charAt(i+1)=='-') {
                        i++;
                    }
                    break;
                case 'l':
                case 'n':
                    if(i < length-1 && input.charAt(i+1)=='j') {
                        i++;
                    }
                    break;
                case 's':
                case 'z':
                    if(i < length-1 && input.charAt(i+1)=='=') {
                        i++;
                    }
                    break;
            }
        }

        bw.write(result + "");
        bw.flush();

        br.close(); bw.close();
    }
}
