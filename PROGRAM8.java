import java.util.*;

public class PROGRAM8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        int[] s = new int[n];
        int[] e = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
            e[i] = sc.nextInt();
        }

        Arrays.sort(s);
        Arrays.sort(e);

        int rooms = 0, ans = 0;
        int i = 0, j = 0;

        while (i < n) {
            if (s[i] < e[j]) {
                rooms++;
                ans = Math.max(ans, rooms);
                i++;
            } else {
                rooms--;
                j++;
            }
        }

        System.out.println(ans);
    }
}
