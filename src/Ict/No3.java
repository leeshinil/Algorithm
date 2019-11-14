package Ict;

import java.io.*;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class No3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int songsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> songs = IntStream.range(0, songsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        long result = playlist(songs);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
    public static long playlist(List<Integer> songs) {
//        long answer = 0;
//        long sum = 0;
//        for(int i = 0; i < songs.size(); i++) {
//            for(int j = i+1; j < songs.size(); j++) {
//                sum = songs.get(i) + songs.get(j);
//                if(sum % 60 == 0) {
//                    answer++;
//                }
//            }
//        }
//
//        return answer;


        //------------------//
        long result = 0;
        int[] d = new int[60];
        for (int song: songs) {
            d[song % 60] += 1;
        }

        for (int song: songs) {
            if (song % 60 == 0) {
                result += d[0];
                result -= 1;
            } else {
                result += d[60 - (song % 60)];
                if (song % 60 == 30) {
                    result -= 1;
                }
            }
        }

        return result / 2;

    }
}


/*
5
30
20
150
100
40
-----
4
10
50
90
30
----
3
60
60
60

 */

