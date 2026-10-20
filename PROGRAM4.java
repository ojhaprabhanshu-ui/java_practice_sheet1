import java.util.*;

public class PROGRAM4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        int[][] a = new int[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }

        Arrays.sort(a, (x, y) -> Integer.compare(x[0], y[0]));

        List<int[]> res = new ArrayList<>();
        int s = a[0][0];
        int e = a[0][1];

        for (int i = 1; i < n; i++) {
            if (a[i][0] <= e) {
                e = Math.max(e, a[i][1]);
            } else {
                res.add(new int[]{s, e});
                s = a[i][0];
                e = a[i][1];
            }
        }
        res.add(new int[]{s, e});

        System.out.println(res.size());
        for (int[] in : res) {
            System.out.println(in[0] + " " + in[1]);
        }
    }
}
