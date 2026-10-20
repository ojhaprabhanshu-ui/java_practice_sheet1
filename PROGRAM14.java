import java.util.*;

public class PROGRAM14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        long k = sc.nextLong();

        long[] pref = new long[n + 1];
        for (int i = 0; i < n; i++) {
            pref[i + 1] = pref[i] + sc.nextLong();
        }

        Deque<Integer> dq = new ArrayDeque<>();
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i <= n; i++) {
            while (!dq.isEmpty() && pref[i] - pref[dq.peekFirst()] >= k) {
                ans = Math.min(ans, i - dq.pollFirst());
            }
            while (!dq.isEmpty() && pref[i] <= pref[dq.peekLast()]) {
                dq.pollLast();
            }
            dq.offerLast(i);
        }

        System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);
    }
}
