package InflearnAlgorithm.Chapter3;

import java.util.*;
import java.util.stream.Collectors;

/*
2. 공통원소 구하기
설명
A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.

입력
첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.
두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.
네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
각 집합의 원소는 1,000,000,000이하의 자연수입니다.

출력
두 집합의 공통원소를 오름차순 정렬하여 출력합니다.

input)
5
1 3 9 5 2
5
3 2 5 7 8

output)
2 3 5
 */
public class Algorithm2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }

        int size2 = in.nextInt();
        int[] arr2 = new int[size2];

        for(int i=0; i<size2; i++){
            arr2[i] = in.nextInt();
        }

        List<Integer> list = new ArrayList<>();

        // 두 배열 정렬
        Arrays.sort(arr);
        Arrays.sort(arr2);

        int p1 =0, p2=0;
        while(p1<size && p2<size2){
            // 두 배열의 원소 비교하여 포인터 옮기기
            if(arr[p1] == arr2[p2]){
                list.add(arr[p1++]);
                p2++;
            }else if( arr[p1] < arr2[p2]){
                p1++;
            }else{
                p2++;
            }
        }

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arrN[] = new int[N];
        for (int i = 0; i < N; i++) {
            arrN[i] = sc.nextInt();
        }
        int M = sc.nextInt();
        int arrM[] = new int[M];
        for (int i = 0; i < M; i++) {
            arrM[i] = sc.nextInt();
        }
        System.out.println(solution(arrN, arrM));
    }
    public static List<Integer> solution(int[] arrN, int[] arrM) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arrN.length; i++) {
            for (int j = 0; j < arrM.length; j++) {
                if (arrN[i] == arrM[j]) {
                    list.add(arrN[i]);
                    break;
                }

            }
        }
        Collections.sort(list);
        return list;
    }
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            list.add(sc.nextInt());
        }

        List<Integer> dup = list.stream().distinct().collect(Collectors.toList());

        for (Integer dupEl: dup) {
            list.remove(dupEl);
        }
        Collections.sort(list);
        for (Integer it : list) {
            System.out.print(it + " ");
        }
    }
}
