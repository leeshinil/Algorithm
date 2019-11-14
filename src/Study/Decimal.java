package Study;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numbers = sc.next();
        char[] list = numbers.toCharArray();
        int[] combArr = new int[list.length];

        for (int i = 0; i < list.length; i++) {
            combArr[i] = Integer.parseInt(String.valueOf(list[i]));
        }

        Set<Integer> sosuList = new HashSet<>();
        for (int i = 1; i <= list.length; i++) {
            perm(list, 0, i, sosuList);
        }

        System.out.println("소수 리스트입니다.");
        System.out.println(sosuList);


    }


    public static void perm(char[] arr, int depth, int k, Set sosuList) {
        if (depth == k) {
            // 한번 depth 가 k로 도달하면 사이클이 돌았음. 출력함.
            print(arr, k, sosuList);
            return;
        } else {
            for (int i = depth; i < arr.length; i++) {
                swap(arr, i, depth);
                perm(arr, depth + 1, k, sosuList);
                swap(arr, i, depth);
            }
        }
    }

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(char[] arr, int k, Set sosuList) {
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i]);
            a.append(arr[i]);
        }
        System.out.println();
        isSosu(sosuList, a);
    }

    private static void isSosu(Set sosuList, StringBuilder a) {
        int b = Integer.parseInt(String.valueOf(a));
        boolean sosu = true;
        if (b <= 1) {
            return;
        }
        for (int j = 2; j <= Math.sqrt(b); j++) {
            if (b % j == 0) {
                sosu = false;
                break;
            }
        }
        if (sosu) {
            sosuList.add(b);
        }
    }
}
