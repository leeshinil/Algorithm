package Ict;

import java.io.*;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class No4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int scoreCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> score = IntStream.range(0, scoreCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int team = Integer.parseInt(bufferedReader.readLine().trim());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        long result = teamFormation(score, team, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    public static long teamFormation(List<Integer> score, int team, int m) {
        long answer = 0;
        int max = 0;
        int maxIndex = 0;
        if(score.size() == team) {
            for(int i = 0; i < score.size() ;i++) {
                answer +=  score.get(i);
            }
        }else {
            while (team != 0) {
                --team;
                for (int i = 0; i < m; i++) {
                    if (max <= score.get(i)) {
                        max = score.get(i);
                        maxIndex = i;
                    }
                }
                for (int j = score.size() - 1; j >= score.size() - m; j--) {
                    if (max <= score.get(j)) {
                        max = score.get(j);
                        maxIndex = j;
                    }
                }
                answer += max;
                score.remove(maxIndex);

                max = 0;
            }
        }
        return answer;
    }
}
/*
9
17
12
10
2
7
2
11
20
8
3
4
 */

