import java.util.*;

public class PROGRAM5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        long k = sc.nextLong();

        Map<Long, Integer> map = new HashMap<>();
        map.put(0L, 1);

        long sum = 0;
        long ans = 0;

        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            sum += x;
            ans += map.getOrDefault(sum - k, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println(ans);
    }
}
