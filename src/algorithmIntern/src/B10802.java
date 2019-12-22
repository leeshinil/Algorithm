import java.util.Scanner;

import static java.lang.Math.min;

public class B10802 {
    final static int N = 100005;
    final static int R = 20150523;

    static int ans1, ans2;
    static int A[] = new int[N];
    static int B[] = new int[N];
    static int C[] = new int[N];
    static int D[] = new int[N];
    static int X[] = new int[N];
    static int Num[] = new int[N];

    static String a, b;

    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        a = sc.next();
        b = sc.next();
        make_table(b.length());
        for (i = 0; i < a.length(); i++) Num[i + 1] = a.charAt(i) - '0';
        for (i = a.length(); Num[i] == 0; i--) Num[i] = 9;
        Num[i]--;
        ans1 = calc(a.length());
        for (i = 0; i < b.length(); i++) Num[i + 1] = b.charAt(i) - '0';
        ans2 = calc(b.length());
        System.out.println((ans2 - ans1 + R) % R);
    }

    public static void make_table(int len) {
        int i;
        B[0] = 1;
        for (i = 1; i <= len; i++) {
            A[i] = (A[i - 1] * 10 + B[i - 1] * 3) % R;
            B[i] = (B[i - 1] * 7) % R;
        }
        C[0] = 1;
        for (i = 1; i <= len; i++) {
            C[i] = (C[i - 1] * 1 + D[i - 1] * 6) % R;
            D[i] = (C[i - 1] * 3 + D[i - 1] * 4) % R;
        }
        X[0] = 1;
        for (i = 1; i <= len; i++) {
            X[i] = (X[i - 1] * 10) % R;
        }

    }

    public static int calc(int len) {
        int i, j, k, s, s2, sum, to;
        s = s2 = sum = 0;
        for (i = 1; i <= len; i++) {
            if (Num[i] == 3 || Num[i] == 6 || Num[i] == 9) break;
        }
        k = i;
        to = min(k, len);
        for (i = 1; i <= to; i++) {
            for (j = 0; j < Num[i]; j++) {
                if (j == 3 || j == 6 || j == 9) s += X[len - i];
                else s += A[len - i];
                s %= R;
            }
        }
        for (i = 1; i <= to; i++) {
            for (j = 0; j < Num[i]; j++) {
                if (j == 3 || j == 6 || j == 9) continue;
                if ((sum + j) % 3 == 0) s += C[len - i];
                else s += D[len - i];
                s %= R;
            }
            sum = (sum + Num[i]) % 3;
        }
        s--;
        for (j = k + 1; j <= len; j++) {
            s2 = (s2 * 10 + Num[j]) % R;
        }
        s += s2;
        if (k <= len || sum % 3 == 0) s++;
        return s % R;
    }
}
