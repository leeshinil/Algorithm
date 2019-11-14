package KakaoIntern;

import java.util.LinkedList;
import java.util.List;


public class No2 {
    public static void main(String[] args) {
        String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
        String s1 = "{{1,2,3},{2,1},{1,2,4,3},{2}}";
        String s2 = "{{20,111},{111}}";
        solution(s);
    }

    public static class listC {
        List list;

        listC(List list) {
            this.list = list;
        }
    }

    public static int[] solution(String s) {
        boolean check = false;
        List<List<Integer>> list = new LinkedList<>();
        List<Integer> list2 = null;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < s.length() - 1; i++) {

            if (s.charAt(i) == '{') {
                check = true;
                list2 = new LinkedList<>();
            } else if (s.charAt(i) == '}') {
                check = false;
                if (sb.toString().length() != 0) {
                    list2.add(Integer.valueOf(sb.toString()));
                }
                list.add(list2);
            } else if (s.charAt(i) == ',') {
                if (!check) {
                    sb = new StringBuilder();
                    continue;
                }
                list2.add(Integer.valueOf(sb.toString()));
                sb = new StringBuilder();
            } else {
                sb.append(s.charAt(i));
            }
        }

        listC points[] = new listC[list.size() + 1];

        for (int i = 0; i < list.size(); i++) {
            List<Integer> list3 = list.get(i);
            points[list3.size()] = new listC(list3);
        }
        int resultstate[] = new int[100001];
        List<Integer> last = points[points.length - 1].list;
        for (int i = 0; i < last.size(); i++) {
            resultstate[last.get(i)] += 1;
        }

        int result[] = new int[points[points.length - 1].list.size()];
        int index = 0;
        for (int i = 1; i < points.length; i++) {
            List<Integer> ll = points[i].list;
            for (int j = 0; j < ll.size(); j++) {
                if (resultstate[ll.get(j)] != 0) {
                    result[index++] = ll.get(j);
                    resultstate[ll.get(j)] -= 1;
                }
            }
        }
        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        return result;
    }

}
