public class Immigration {
    public static void main(String[] args) {
        int n = 5;
        int times[] = {6, 10};
        System.out.print(solution(n, times));

    }

    public static long solution(int n, int[] times) {
        int max = 0;
        for (int time : times) {
            if (time > max) max = time;
        }

        long low = 1;
        long high = (long) max * n;  // 최악의 상황

        while (low + 1 < high) {
            long mid = (low + high) / 2;
            long count = passCount(mid, times);
            if (count < n) low = mid;
            else high = mid;
        }
        if (passCount(low, times) >= n) return (int) low;
        return (int) high;
    }

    public static long passCount(long mid, int[] times) {
        long count = 0;
        for (int time : times) {
            if (time > mid) continue;
            count += (mid / time);
        }
        return count;
    }
}
