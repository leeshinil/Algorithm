package Ict;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class No1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int operationsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> operations = IntStream.range(0, operationsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .collect(toList());

        int xCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> x = IntStream.range(0, xCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

            List<Long> result = maxMin(operations, x);

            bufferedWriter.write(
                    result.stream()
                            .map(Object::toString)
                            .collect(joining("\n"))
                            + "\n"
            );


        bufferedReader.close();
        bufferedWriter.close();
    }

    public static List<Long> maxMin(List<String> operations, List<Integer> x) {
        List<Integer> answer = new ArrayList();
        List<Long> ans = new ArrayList<>();
        for(int i = 0; i < operations.size(); i++) {

            if (operations.get(i).equals("push")) {
                answer.add(x.get(i));

            } else {
                answer.remove((Integer) x.get(i));
            }
            ans.add((long) Collections.min(answer) * Collections.max(answer));
        }
        return ans;
    }
    //heap 사용
}

/*
4
push
push
push
pop
4
1
2
3
1
 */





