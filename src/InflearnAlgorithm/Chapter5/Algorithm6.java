package InflearnAlgorithm.Chapter5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
6. 공주 구하기

input)
8 3
output)
7
 */
public class Algorithm6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> que = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            que.offer(i +1);
        }
        int pointer = 0;
        while(que.size() > 1) {
            if (pointer == k) {
                que.poll();
                pointer = 1;
            } else {
                que.offer(que.poll());
                pointer++;
            }
        }
        System.out.println(que.poll());
    }
}
