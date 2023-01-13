package InflearnAlgorithm.Chapter4;

/*
4. 모든 아나그램 찾기
설명
S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.

입력
첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.
S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.

출력
S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다.

input)
bacaAacba
abc

output)
3
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Algorithm4 {
    // 다른 방법
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        String[] sArr = new String[s.length() - t.length() + 1];
        for (int i = 0; i < s.length() - t.length() + 1; i++) {
            sArr[i] = "";
            for (int j = i; j < i + t.length(); j++) {
                sArr[i] += s.charAt(j);
            }
        }

        int count = 0;
        for (int i = 0; i < sArr.length; i++) {
            HashMap<Character, Integer> map1 = new HashMap<>();
            HashMap<Character, Integer> map2 = new HashMap<>();
            for (int j = 0; j < sArr[i].length(); j++) {
                map1.put(sArr[i].charAt(j), sArr[i].length() -  sArr[i].replace(Character.toString(sArr[i].charAt(j)), "").length());
                map2.put(t.charAt(j), t.length() - t.replace(Character.toString(t.charAt(j)), "").length());
            }
            if (map1.equals(map2)) {
                count++;
            }
        }
        System.out.println(count);
    }
    public static int solution(String s, String t) {
        int answer = 0;

        Map<Character, Integer> smap = new HashMap<>();
        Map<Character, Integer> tmap = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            tmap.put(t.charAt(i), tmap.getOrDefault(t.charAt(i), 0) + 1);
        }

        for (int i = 0; i < t.length()-1; i++) {
            smap.put(s.charAt(i), smap.getOrDefault(s.charAt(i), 0) + 1);
        }

        int left = 0;
        for (int right = t.length()-1; right < s.length(); right++) {
            smap.put(s.charAt(right), smap.getOrDefault(s.charAt(right), 0) + 1);

            if (smap.equals(tmap)) {
                answer++;
            }
            smap.put(s.charAt(left), smap.get(s.charAt(left)) - 1);

            if (smap.get(s.charAt(left)) == 0) {
                smap.remove(s.charAt(left));
            }
            left++;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = br.readLine();

        System.out.println(solution(s, t));
    }
}
