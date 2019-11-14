package Line;

import java.util.Scanner;

public class No1 {

    static int messageCount;
    static int consumer;
    static int message[];
    static Consumer c[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        messageCount = sc.nextInt();
        consumer = sc.nextInt();
        message = new int[messageCount];
        for (int i = 0; i < messageCount; i++) {
            message[i] = sc.nextInt();
        }
        c = new Consumer[consumer];
        for (int i = 0; i < consumer; i++) {
            if (i >= messageCount) c[i] = null;
            else {
                c[i] = new Consumer(message[i]);
            }
        }

        int time = 1;
        int index = consumer;
        while (!isEmptyMessage()) {
            for (int i = 0; i < consumer; i++) {
                if (c[i] == null) continue;
                c[i].setCount();
                if (c[i].isFinish()) {
                    if (index >= messageCount) c[i] = null;
                    else {
                        c[i] = new Consumer(message[index++]);
                    }
                }
            }

            time++;
        }
        System.out.println(time - 1);
    }

    static class Consumer {
        int messageCount;

        Consumer(int messageCount) {
            this.messageCount = messageCount;
        }

        void setCount() {
            messageCount--;
        }

        boolean isFinish() {
            return messageCount == 0 ? true : false;
        }
    }

    static boolean isEmptyMessage() {
        for (int i = 0; i < consumer; i++) {
            if (c[i] != null && !c[i].isFinish()) return false;
        }
        return true;
    }
}