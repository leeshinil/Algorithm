package InflearnAlgorithm.Chapter6;

/*
4. Least Recently Used


input)
5 9
1 2 3 2 6 2 3 5 7

output)
7 5 3 2 6
 */

import java.util.*;

public class Algorithm4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Queue<Integer> que = new LinkedList<>();
        que.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if (que.contains(arr[i])) {
                que.remove(arr[i]);
                que.add(arr[i]);
            } else {
                que.add(arr[i]);
            }
        }
        int size = que.size();
        if (size - s > 0) {
            for (int i = 0; i < size - s; i++) {
                que.poll();
            }
        }
        Stack<Integer> stack = new Stack<>();

        // que reversing
        for (int i = 0; i < s; i++) {
            stack.push(que.poll());
        }
        for (int i = 0; i < s; i++) {
            System.out.print(stack.pop() + " ");
        }
    }
}
